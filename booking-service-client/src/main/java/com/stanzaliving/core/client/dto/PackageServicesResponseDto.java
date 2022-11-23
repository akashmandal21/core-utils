package com.stanzaliving.core.client.dto;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PackageServicesResponseDto {

    private List<Map.Entry<String, List<String>>> ancillary;
    private List<Map.Entry<String, List<String>>> complementory;
}
