package com.stanzaliving.core.elastic.service;

import java.io.Serializable;
import java.util.List;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

import com.stanzaliving.core.elastic.dto.AbstractIndexDto;

public interface AbstractSearchService<T extends AbstractIndexDto, I extends Serializable> {

	T save(T index);

	T update(T index);

	Iterable<T> save(List<T> indexs);

	Iterable<T> update(List<T> indexs);

	T find(I id);

	Iterable<T> find(List<I> ids);

	Iterable<T> findAll();

	List<T> findList(List<I> ids);

	List<T> findAllList();

	Page<T> findAll(Pageable pageable);

	void deleteIndex(T index);

	void deleteIndex(List<T> index);

	void deleteIndex(I id);

	void deleteAll();

	ElasticsearchTemplate getTemplate();

	String getIndexName();

	String getTypeName();

	void updateId(T index);

	String toSubStringMatch(String text);

	String toSubStringMatch(boolean matchBefore, String text, boolean matchAfter);

	List<String> polygonQuery(List<GeoPoint> geoPoints, String indexName, String latLongFieldName, String keyFieldName);

	SearchResponse getSearchBucketTermResponse(
			QueryBuilder query,
			String outerBucketName, String outerBucketField,
			String innerBucketName, String innerBucketField);

	SearchResponse getSearchBucketAvgResponse(
			QueryBuilder query,
			String outerBucketName, String outerBucketField,
			String innerBucketName, String innerBucketField);

	SearchResponse getSearchBucketCountResponse(
			QueryBuilder query,
			String outerBucketName, String outerBucketField,
			String innerBucketName, String innerBucketField);

	SearchResponse getSearchBucketTermResponse(QueryBuilder query,
			String outerBucketName, String outerBucketField, Integer outerBucketSize,
			String innerBucketName, String innerBucketField);

	SearchResponse getSearchBucketAvgResponse(
			QueryBuilder query,
			String outerBucketName, String outerBucketField, Integer outerBucketSize,
			String innerBucketName, String innerBucketField);

	SearchResponse getSearchBucketCountResponse(
			QueryBuilder query,
			String outerBucketName, String outerBucketField, Integer outerBucketSize,
			String innerBucketName, String innerBucketField);

	List<Object> getField(QueryBuilder query, String outerBucketField);

	List<Object> getField(QueryBuilder query, String outerBucketField, int outerBucketSize);

}