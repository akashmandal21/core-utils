package com.stanzaliving.item_master.dtos;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ItemMetaDto {

    private Department department;
    private List<UIKeyValue> costHeads;
    private List<UIKeyValue> categories;
    private List<UIKeyValue> subCategories;
    private List<String> itemNames;

}
