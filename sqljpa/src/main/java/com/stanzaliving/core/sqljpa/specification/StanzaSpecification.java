package com.stanzaliving.core.sqljpa.specification;

import com.stanzaliving.core.base.StanzaConstants;
import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;
import com.stanzaliving.core.sqljpa.specification.utils.SearchCriteria;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Collection;
import java.util.Date;
import java.util.regex.Pattern;

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
                if (criteria.getValue() instanceof Collection<?>) {
                    final Path<String> group = root.<String>get(criteria.getKey());
                    return group.in(((Collection<?>) criteria.getValue()).toArray());
                }

                return null;

            case EQ:
                return builder.equal(
                        root.get(criteria.getKey()), criteria.getValue().toString());

            case NOT_EQ:
                return builder.notEqual(
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
                if (criteria.getValue() instanceof LocalDate) {
                    return builder.equal(root.get(criteria.getKey()), Date.from(((LocalDate) criteria.getValue()).atStartOfDay(ZoneId.of(StanzaConstants.IST_TIMEZONE)).toInstant()));
                } else {
                    return builder.equal(root.get(criteria.getKey()), criteria.getValue());
                }
            case DATE_LT:
                if (criteria.getValue() instanceof LocalDate) {
                    return builder.lessThan(root.get(criteria.getKey()), Date.from(((LocalDate) criteria.getValue()).atStartOfDay(ZoneId.of(StanzaConstants.IST_TIMEZONE)).toInstant()));
                } else {
                    return builder.lessThan(root.get(criteria.getKey()), (Date) criteria.getValue());
                }
            case DATE_GT:
                if (criteria.getValue() instanceof LocalDate) {
                    return builder.greaterThan(root.get(criteria.getKey()), Date.from(((LocalDate) criteria.getValue()).atStartOfDay(ZoneId.of(StanzaConstants.IST_TIMEZONE)).toInstant()));
                } else {
                    return builder.greaterThan(root.get(criteria.getKey()),(Date) criteria.getValue());
                }
            case DATE_LTE:
                if (criteria.getValue() instanceof LocalDate) {
                    return builder.lessThanOrEqualTo(
                            root.get(criteria.getKey()), Date.from(((LocalDate) criteria.getValue()).atStartOfDay(ZoneId.of(StanzaConstants.IST_TIMEZONE)).toInstant()));
                } else {
                    return builder.lessThanOrEqualTo(root.get(criteria.getKey()), (Date) criteria.getValue());
                }
            case DATE_GTE:
                if (criteria.getValue() instanceof LocalDate) {
                    return builder.greaterThanOrEqualTo(
                            root.get(criteria.getKey()), Date.from(((LocalDate) criteria.getValue()).atStartOfDay(ZoneId.of(StanzaConstants.IST_TIMEZONE)).toInstant()));
                } else {
                    return builder.greaterThanOrEqualTo(root.get(criteria.getKey()), (Date) criteria.getValue());
                }
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

            case LOCAL_TIME_EQ:
                return builder.equal(
                        root.get(criteria.getKey()), LocalTime.parse(criteria.getValue().toString()));

            case LOCAL_TIME_LT:
                return builder.lessThan(
                        root.get(criteria.getKey()), LocalTime.parse(criteria.getValue().toString()));

            case LOCAL_TIME_GT:
                return builder.greaterThan(
                        root.get(criteria.getKey()), LocalTime.parse(criteria.getValue().toString()));

            case LOCAL_TIME_LTE:
                return builder.lessThanOrEqualTo(
                        root.get(criteria.getKey()), LocalTime.parse(criteria.getValue().toString()));

            case LOCAL_TIME_GTE:
                return builder.greaterThanOrEqualTo(
                        root.get(criteria.getKey()), LocalTime.parse(criteria.getValue().toString()));

            case REGEXP:
                Pattern regexPattern = Pattern.compile(String.valueOf(criteria.getValue()));
                Expression<String> patternExpression = builder.<String>literal(regexPattern.pattern());
                return builder.equal(builder.function("regexp", Integer.class, patternExpression, root.<String>get(criteria.getKey())), 1);

            case FIND_IN_SET:
                Expression<String> valExpression = builder.<String>literal(String.valueOf(criteria.getValue()));
                return builder.greaterThan(builder.function("find_in_set", Integer.class, valExpression, root.<String>get(criteria.getKey())), 0);

            case ENUM_EQ:
                return builder.equal(
                        root.get(criteria.getKey()), criteria.getValue());
            case ENUM_IN:
                if (criteria.getValue() instanceof Collection<?>) {
                    final Path<Enum<?>> group = root.<Enum<?>>get(criteria.getKey());
                    return group.in(((Collection<?>) criteria.getValue()).toArray());
                }
                return null;
            case IS_NULL:
                return builder.isNull(root.get(criteria.getKey()));
            default:
                return null;
        }
    }
}