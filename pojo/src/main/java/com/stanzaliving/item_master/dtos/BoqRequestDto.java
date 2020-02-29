package com.stanzaliving.item_master.dtos;

import com.stanzaliving.item_master.enums.ItemType;
import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.SubBrandName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoqRequestDto {
    private BrandName brandName;
    private SubBrandName subBrandName;
    private List<ItemType> itemTypes;
    private String cityUuid;
    List<UpdatedBoqItemRequest> updatedBoqItemRequests;
}
