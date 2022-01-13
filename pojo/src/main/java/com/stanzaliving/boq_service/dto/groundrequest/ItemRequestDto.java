package com.stanzaliving.boq_service.dto.groundrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemRequestDto {

    private String propertyUuid;

    private String itemUuid;

    private boolean isExtra;

    private List<ItemRequestMetaDto> itemQuantityAndAouList;

}
