package com.stanzaliving.core.boq_service.servicemix.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ServiceMixDto {
    private String serviceUuid;
    private String serviceName;
    private Boolean enabled;
    private int order;
    private Map<String, List<String>> optionList;
    private  List<Map<String,Object>> subServices;
}
