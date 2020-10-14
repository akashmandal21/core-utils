package com.stanzaliving.core.generic.validation.fieldProcessors;

import java.util.List;

public interface TemplateListSection {
    List<Object> getData();
    void setData(List<?> data);
}