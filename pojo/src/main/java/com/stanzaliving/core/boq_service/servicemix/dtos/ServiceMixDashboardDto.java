package com.stanzaliving.core.boq_service.servicemix.dtos;

import com.stanzaliving.core.boq_service.servicemix.enums.ServiceMixStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServiceMixDashboardDto {
    private String propertyUuid;
    private int beds;
    private int roomCount;
    private String propertyServiceMixUuid;
    private ServiceMixStatus serviceMixStatus;
    private String serviceMixStatusText;
    private boolean editable;
    private boolean actionable;
    private List<ServiceMixDto> services;
}
