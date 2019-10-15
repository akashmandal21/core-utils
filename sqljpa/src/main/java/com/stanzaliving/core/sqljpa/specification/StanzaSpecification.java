package com.stanzaliving.core.sqljpa.specification;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.stanzaliving.core.base.StanzaConstants;
import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;
import com.stanzaliving.core.sqljpa.specification.utils.SearchCriteria;

public class StanzaSpecification<T extends AbstractJpaEntity> implements Specification<T> {

	private static final long serialVersionUID = 1L;

	private SearchCriteria criteria;

	public StanzaSpecification(SearchCriteria sc) {
		criteria = sc;
	}

	@Override
	public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder builder) {

		switch (criteria.getOperation()) {

			case TRUE:
				return builder.isTrue(root.get(criteria.getKey()));

			case FALSE:
				return builder.isFalse(root.get(criteria.getKey()));

			case LIKE:
				return builder.like(root.get(criteria.getKey()), criteria.getValue().toString());

			case IN:
				if (criteria.getValue() instanceof List<?>) {
					final Path<String> group = root.<String> get(criteria.getKey());
					return group.in(((List<?>) criteria.getValue()).toArray());
				}

				return null;

			case EQ:
				return builder.equal(
						root.get(criteria.getKey()), criteria.getValue().toString());

			case LT:
				return builder.lessThan(
						root.get(criteria.getKey()), criteria.getValue().toString());

			case GT:
				return builder.greaterThan(
						root.get(criteria.getKey()), criteria.getValue().toString());

			case LTE:
				return builder.lessThanOrEqualTo(
						root.get(criteria.getKey()), criteria.getValue().toString());

			case GTE:
				return builder.greaterThanOrEqualTo(
						root.get(criteria.getKey()), criteria.getValue().toString());

			case DATE_EQ:
				return builder.equal(
						root.get(criteria.getKey()), Date.from(((LocalDate) criteria.getValue()).atStartOfDay(ZoneId.of(StanzaConstants.IST_TIMEZONE)).toInstant()));

			case DATE_LT:
				return builder.lessThan(
						root.get(criteria.getKey()), Date.from(((LocalDate) criteria.getValue()).atStartOfDay(ZoneId.of(StanzaConstants.IST_TIMEZONE)).toInstant()));

			case DATE_GT:
				return builder.greaterThan(
						root.get(criteria.getKey()), Date.from(((LocalDate) criteria.getValue()).atStartOfDay(ZoneId.of(StanzaConstants.IST_TIMEZONE)).toInstant()));

			case DATE_LTE:
				return builder.lessThanOrEqualTo(
						root.get(criteria.getKey()), Date.from(((LocalDate) criteria.getValue()).atStartOfDay(ZoneId.of(StanzaConstants.IST_TIMEZONE)).toInstant()));

			case DATE_GTE:
				return builder.greaterThanOrEqualTo(
						root.get(criteria.getKey()), Date.from(((LocalDate) criteria.getValue()).atStartOfDay(ZoneId.of(StanzaConstants.IST_TIMEZONE)).toInstant()));

			case LOCAL_DATE_EQ:
				return builder.equal(
						root.get(criteria.getKey()), LocalDate.parse(criteria.getValue().toString()));

			case LOCAL_DATE_LT:
				return builder.lessThan(
						root.get(criteria.getKey()), LocalDate.parse(criteria.getValue().toString()));

			case LOCAL_DATE_GT:
				return builder.greaterThan(
						root.get(criteria.getKey()), LocalDate.parse(criteria.getValue().toString()));

			case LOCAL_DATE_LTE:
				return builder.lessThanOrEqualTo(
						root.get(criteria.getKey()), LocalDate.parse(criteria.getValue().toString()));

			case LOCAL_DATE_GTE:
				return builder.greaterThanOrEqualTo(
						root.get(criteria.getKey()), LocalDate.parse(criteria.getValue().toString()));

			case REGEXP:
				Pattern regexPattern = Pattern.compile(String.valueOf(criteria.getValue()));
				Expression<String> patternExpression = builder.<String> literal(regexPattern.pattern());
				return builder.equal(builder.function("regexp", Integer.class, patternExpression, root.<String> get(criteria.getKey())), 1);

			case FIND_IN_SET:
				Expression<String> valExpression = builder.<String> literal(String.valueOf(criteria.getValue()));
				return builder.greaterThan(builder.function("find_in_set", Integer.class, valExpression, root.<String> get(criteria.getKey())), 0);

			case ENUM_EQ:
				return builder.equal(
						root.get(criteria.getKey()), criteria.getValue());

			default:
				return null;
		}
	}
}