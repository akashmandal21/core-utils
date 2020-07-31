package com.stanzaliving.core.boq_service.servicemix.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class ServiceItemDto {
    private String itemUuid;
    private String itemCode;
    private String itemName;
    private List<ServiceItemFields> fields;
}
