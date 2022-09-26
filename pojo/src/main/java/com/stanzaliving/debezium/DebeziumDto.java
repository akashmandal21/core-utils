package com.stanzaliving.debezium;

import lombok.Builder;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Map;

public class DebeziumDto<T> {

    @NotBlank
    private String uuid;
    private T data;
    @Builder.Default
    private Date timeStamp = new Date();
    private Map<String, Object> optionalData;
    private TableStructure tableStructure;
}
