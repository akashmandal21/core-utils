package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DegreeResponseDto {
    private int degreeId;
    private String name;
    private boolean enabled;
    private int maxYears;
}
