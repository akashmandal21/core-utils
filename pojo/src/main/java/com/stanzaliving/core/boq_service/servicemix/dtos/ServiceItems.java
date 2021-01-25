package com.stanzaliving.core.boq_service.servicemix.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@AllArgsConstructor
@Data
public class ServiceItems {
    private List<ServiceItemDto> items;
}
