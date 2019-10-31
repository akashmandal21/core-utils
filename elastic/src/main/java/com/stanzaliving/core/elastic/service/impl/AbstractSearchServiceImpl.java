package com.stanzaliving.core.elastic.service.impl;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.common.unit.DistanceUnit;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.GeoDistanceQueryBuilder;
import org.elasticsearch.index.query.GeoPolygonQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.sort.GeoDistanceSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;

import com.google.common.collect.Lists;
import com.stanzaliving.core.base.StanzaConstants;
import com.stanzaliving.core.base.enums.DateFormat;
import com.stanzaliving.core.base.utils.DateUtil;
import com.stanzaliving.core.elastic.dto.AbstractIndexDto;
import com.stanzaliving.core.elastic.repository.AbstractRepository;
import com.stanzaliving.core.elastic.service.AbstractSearchService;

import lombok.extern.log4j.Log4j2;

@Log4j2
public abstract class AbstractSearchServiceImpl<T extends AbstractIndexDto, I extends Serializable, R extends AbstractRepository<T, I>>
		implements AbstractSearchService<T, I> {

	protected int limit = 10000;
	protected int outerBucketSize = 99999;
	protected int innerBucketSize = 99999;

	private static String elastticSearchWildCord = "*";

	@Autowired
	private ElasticsearchTemplate elasticsearchTemplate;

	protected abstract R getRepository();

	@Override
	public T save(T index) {
		updateId(index);
		return getRepository().save(preSave(index));
	}

	@Override
	public final T update(T index) {
		return getRepository().save(preUpdate(index));
	}

	@Override
	public Iterable<T> save(List<T> indexs) {
		indexs.forEach(this::updateId);
		return getRepository().saveAll(indexs.stream().map(this::preSave).collect(Collectors.toList()));
	}

	@Override
	public final Iterable<T> update(List<T> indexs) {
		return getRepository().saveAll(indexs.stream().map(this::preUpdate).collect(Collectors.toList()));
	}

	@Override
	public final T find(I id) {
		return getRepository().findById(id).orElse(null);
	}

	@Override
	public final Iterable<T> find(List<I> ids) {
		return getRepository().findAllById(ids);
	}

	@Override
	public final List<T> findList(List<I> ids) {
		return Lists.newArrayList(getRepository().findAllById(ids));
	}

	@Override
	public final Iterable<T> findAll() {
		return getRepository().findAll(PageRequest.of(0, 5000)).getContent();
	}

	@Override
	public final List<T> findAllList() {
		return Lists.newArrayList(findAll());
	}

	@Override
	public final Page<T> findAll(Pageable pageable) {
		return getRepository().findAll(pageable);
	}

	@Override
	public final void deleteIndex(T index) {
		getRepository().delete(index);
	}

	@Override
	public final void deleteIndex(List<T> indexs) {
		getRepository().deleteAll(indexs);
	}

	@Override
	public void deleteIndex(I id) {
		getRepository().deleteById(id);
	}

	@Override
	public final void deleteAll() {
		getRepository().deleteAll();
	}

	public ElasticsearchTemplate getTemplate() {
		return elasticsearchTemplate;
	}

	private T preSave(T index) {

		if (StringUtils.isEmpty(index.getId())) {
			index.setId(UUID.randomUUID().toString());
		}

		if (index.getStatus() == null) {
			index.setStatus(true);
		}

		Date date = DateUtil.convertToDate(LocalDateTime.now(StanzaConstants.IST_TIMEZONEID));

		if (index.getCreatedAt() == null) {
			index.setCreatedAt(DateUtil.customDateFormatter(date, DateFormat.ELASTIC_SEARCH));
		}

		if (index.getUpdatedAt() == null) {
			index.setUpdatedAt(DateUtil.customDateFormatter(date, DateFormat.ELASTIC_SEARCH));
		}

		return index;
	}

	private T preUpdate(T index) {
		Date date = DateUtil.convertToDate(LocalDateTime.now(StanzaConstants.IST_TIMEZONEID));

		index.setUpdatedAt(DateUtil.customDateFormatter(date, DateFormat.ELASTIC_SEARCH));

		return index;
	}

	public Map<Object, Object> distance(Double latitude, Double longitude, Integer distance, String latLongFieldName, DistanceUnit distanceUnit) {

		Map<Object, Object> result = new HashMap<>();

		GeoDistanceQueryBuilder geoDisQuery = QueryBuilders.geoDistanceQuery(latLongFieldName)
				.distance(distance, distanceUnit)
				.point(latitude, longitude);

		TermQueryBuilder isPublishedFilter = QueryBuilders.termQuery("isPublished", true);

		BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
		boolQueryBuilder.must().add(geoDisQuery);
		boolQueryBuilder.must().add(isPublishedFilter);

		GeoDistanceSortBuilder sortOptions = SortBuilders.geoDistanceSort(latLongFieldName, latitude, longitude).unit(distanceUnit);

		SearchQuery query =
				new NativeSearchQueryBuilder()
						.withIndices(getIndexName())
						.withQuery(boolQueryBuilder)
						.withPageable(PageRequest.of(0, limit))
						.withSort(sortOptions)
						.build();

		getTemplate().query(query, response -> {

			log.info(" Search Hits found : " + response.getHits().getTotalHits());
			for (SearchHit hit : response.getHits()) {

				if (hit != null) {
					result.put(hit.getId(), hit.getSortValues()[0]);
				}
			}
			return result;
		});

		return result;
	}

	public List<String> polygonQuery(List<GeoPoint> geoPoints,
			String indexName,
			String latLongFieldName,
			String keyFieldName) {

		List<String> result = new ArrayList<>();

		List<org.elasticsearch.common.geo.GeoPoint> geoPints = new ArrayList<>();
		for (GeoPoint point : geoPoints) {
			geoPints.add(new org.elasticsearch.common.geo.GeoPoint(point.getLat(), point.getLon()));
		}

		GeoPolygonQueryBuilder polygonQueryBuilder = new GeoPolygonQueryBuilder(latLongFieldName, geoPints);

		QueryBuilder queryBuilder = QueryBuilders.termQuery("active", "true");

		SearchQuery query =
				new NativeSearchQueryBuilder()
						.withIndices(indexName)
						.withQuery(queryBuilder)
						.withPageable(PageRequest.of(0, 1000))
						.withFilter(polygonQueryBuilder)
						.build();

		getTemplate().query(query, response -> {

			for (SearchHit searchHit : response.getHits()) {
				result.add(searchHit.getId());
			}

			return result;
		});

		return result;
	}

	public List<Object> boundingBoxFilter(QueryBuilder queryBuilders, String keyFieldName) {
		List<Object> result = new ArrayList<>();

		SearchQuery query =
				new NativeSearchQueryBuilder()
						.withIndices(getIndexName())
						.withQuery(queryBuilders)
						.withFilter(QueryBuilders.termQuery("isPublished", Boolean.TRUE))
						.withPageable(PageRequest.of(0, limit))
						.build();

		getTemplate().query(query, response -> {

			for (SearchHit hit : response.getHits()) {

				if (hit != null) {
					result.add(hit.getSourceAsMap().get(keyFieldName));
				}
			}

			return result;
		});

		return result;
	}

	@Override
	public String toSubStringMatch(String text) {
		return toSubStringMatch(false, text, false);
	}

	@Override
	public String toSubStringMatch(boolean matchBefore, String text, boolean matchAfter) {
		if (StringUtils.isEmpty(text)) {
			return "";
		}
		return (matchBefore ? elastticSearchWildCord : "") + text.trim() + (matchAfter ? elastticSearchWildCord : "");
	}

	public SearchResponse getSearchBucketTermResponse(QueryBuilder query,
			String outerBucketName,
			String outerBucketField,
			String innerBucketName,
			String innerBucketField) {

		return getSearchBucketAvgResponse(query,
				outerBucketName,
				outerBucketField,
				outerBucketSize,
				innerBucketName,
				innerBucketField);
	}

	public SearchResponse getSearchBucketAvgResponse(QueryBuilder query,
			String outerBucketName,
			String outerBucketField,
			String innerBucketName,
			String innerBucketField) {

		return getSearchBucketAvgResponse(query,
				outerBucketName,
				outerBucketField,
				outerBucketSize,
				innerBucketName,
				innerBucketField);

	}

	public SearchResponse getSearchBucketCountResponse(QueryBuilder query,
			String outerBucketName,
			String outerBucketField,
			String innerBucketName,
			String innerBucketField) {

		return getSearchBucketAvgResponse(query,
				outerBucketName,
				outerBucketField,
				outerBucketSize,
				innerBucketName,
				innerBucketField);

	}

	public SearchResponse getSearchBucketTermResponse(QueryBuilder query,
			String outerBucketName,
			String outerBucketField,
			Integer outerBucketSize,
			String innerBucketName,
			String innerBucketField,
			Integer innerBucketSize) {

		SearchRequestBuilder searchRequestBuilder =
				getTemplate()
						.getClient()
						.prepareSearch(getIndexName())
						.setTypes(getTypeName())
						.setQuery(query)
						.setSize(0)
						.addAggregation(
								AggregationBuilders
										.terms(outerBucketName)
										.field(outerBucketField)
										.size(outerBucketSize)
										.subAggregation(
												AggregationBuilders
														.terms(innerBucketName)
														.field(innerBucketField)
														.size(innerBucketSize)));

		return searchRequestBuilder.execute().actionGet();
	}

	public SearchResponse getSearchBucketAvgResponse(QueryBuilder query,
			String outerBucketName,
			String outerBucketField,
			Integer outerBucketSize,
			String innerBucketName,
			String innerBucketField) {

		SearchRequestBuilder searchRequestBuilder =
				getTemplate()
						.getClient()
						.prepareSearch(getIndexName())
						.setTypes(getTypeName())
						.setQuery(query)
						.setSize(0)
						.addAggregation(
								AggregationBuilders
										.terms(outerBucketName)
										.field(outerBucketField)
										.size(outerBucketSize)
										.subAggregation(
												AggregationBuilders
														.avg(innerBucketName)
														.field(innerBucketField)));

		return searchRequestBuilder.execute().actionGet();

	}

	public SearchResponse getSearchBucketCountResponse(QueryBuilder query,
			String outerBucketName,
			String outerBucketField,
			Integer outerBucketSize,
			String innerBucketName,
			String innerBucketField) {

		SearchRequestBuilder searchRequestBuilder = getTemplate()
				.getClient()
				.prepareSearch(getIndexName())
				.setTypes(getTypeName())
				.setQuery(query)
				.setSize(0)
				.addAggregation(
						AggregationBuilders
								.terms(outerBucketName)
								.field(outerBucketField)
								.size(outerBucketSize)
								.subAggregation(
										AggregationBuilders
												.count(innerBucketName)
												.field(innerBucketField)));

		return searchRequestBuilder.execute().actionGet();

	}

	@Override
	public List<Object> getField(QueryBuilder query, String outerBucketField) {
		return getField(query,
				outerBucketField,
				outerBucketSize);
	}

	@Override
	public List<Object> getField(QueryBuilder query, String outerBucketField, int outerBucketSize) {

		List<Object> returnFieldList = new ArrayList<>();

		SearchRequestBuilder searchRequestBuilder = getTemplate()
				.getClient()
				.prepareSearch(getIndexName())
				.setTypes(getTypeName())
				.setQuery(query)
				.setSize(0)
				.addAggregation(
						AggregationBuilders
								.terms("OUTER__AGGREGATION")
								.field(outerBucketField)
								.size(outerBucketSize));

		SearchResponse searchResponse = searchRequestBuilder.execute().actionGet();
		Terms bookingTerm = searchResponse.getAggregations().get("OUTER__AGGREGATION");

		if (!bookingTerm.getBuckets().isEmpty()) {
			returnFieldList =
					bookingTerm.getBuckets()
							.parallelStream()
							.map(bucket -> bucket.getAggregations().getAsMap())
							.collect(Collectors.toList());
		}

		return returnFieldList;
	}
}