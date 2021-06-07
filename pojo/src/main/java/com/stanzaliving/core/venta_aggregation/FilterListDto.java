package com.stanzaliving.core.venta_aggregation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FilterListDto implements Serializable {
    private String label;
    private Object value;
}