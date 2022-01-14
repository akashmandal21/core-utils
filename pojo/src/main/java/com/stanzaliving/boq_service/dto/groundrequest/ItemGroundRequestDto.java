package com.stanzaliving.boq_service.dto.groundrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemGroundRequestDto {

    private String propertyUuid;

    private String itemUuid;

    private boolean isExtra;

    @Valid
    private List<ItemQtyAOUDto> itemQuantityAndAouList;
}
