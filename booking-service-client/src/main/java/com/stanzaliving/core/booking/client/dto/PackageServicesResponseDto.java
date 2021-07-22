package com.stanzaliving.core.booking.client.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PackageServicesResponseDto {

    private List<Map.Entry<String, List<String>>> ancillary;
    private List<Map.Entry<String, List<String>>> complementory;
}
