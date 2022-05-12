package com.stanzaliving.venta;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Builder
@Getter
@Setter
public class ResidenceDto {
    private Map<String, String> residenceMap;
}
