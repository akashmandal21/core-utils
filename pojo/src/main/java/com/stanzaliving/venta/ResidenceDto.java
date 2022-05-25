package com.stanzaliving.venta;

import lombok.*;

import java.util.List;
import java.util.Map;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceDto {
    private Map<String, String> residenceMap;
}
