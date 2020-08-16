package com.stanzaliving.core.generic.validation.filter;

import org.springframework.data.mongodb.core.query.Query;

import java.util.Map;

public interface TemplateFilter {
    void setData(Map<String, String> data);
    Query getFilterCriterion();
    Query getFilterCriterion(Query query);
    String getFormattedString();
}
