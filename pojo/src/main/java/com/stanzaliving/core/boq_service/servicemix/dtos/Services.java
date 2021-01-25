package com.stanzaliving.core.boq_service.servicemix.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Services {
    private String serviceUuid;
    private String serviceName;
    private int order;
    private boolean enabled;
    private ServiceItems items;
}
