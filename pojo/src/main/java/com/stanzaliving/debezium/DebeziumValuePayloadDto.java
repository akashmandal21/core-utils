package com.stanzaliving.debezium;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
//@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class DebeziumValuePayloadDto<T> {
    T before;
    T after;
    ValuePayloadSource source;

    @JsonCreator
    public DebeziumValuePayloadDto(@JsonProperty("before") T before, @JsonProperty("after") T after, @JsonProperty("source") ValuePayloadSource source) {
        this.before = before;
        this.after = after;
        this.source = source;
    }
}
