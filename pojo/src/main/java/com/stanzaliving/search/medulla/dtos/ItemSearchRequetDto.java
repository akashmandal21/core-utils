package com.stanzaliving.search.medulla.dtos;


import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.dto.PageAndSortDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ItemSearchRequetDto {
    private String searchText;
    private Department department;
    private String itemCategory;
    private String itemSubCategory;
    private String itemCostHead;
    private PageAndSortDto pageDto;
    private String[] fieldsNeeded;
}
