package com.stanzaliving.boq_service.dto.groundrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemGroundRequestDto {

    @NotBlank(message = "Property uuid can not be blank")
    private String propertyUuid;

    @NotBlank(message = "Item uuid can not be blank")
    private String itemUuid;

    private Boolean isExtra;        //null when GET, mandatory when POST    //todo: fix logic

    private boolean isDeleted;

    @Valid
    private List<ItemQtyAOUDto> itemQuantityAndAouList;
}
