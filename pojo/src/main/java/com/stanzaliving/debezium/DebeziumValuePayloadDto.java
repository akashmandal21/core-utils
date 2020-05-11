package com.stanzaliving.debezium;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class DebeziumValuePayloadDto<T> {
    T before;
    T after;
    ValuePayloadSource source;
}
