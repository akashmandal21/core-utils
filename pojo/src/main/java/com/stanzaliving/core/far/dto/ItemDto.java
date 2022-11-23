package com.stanzaliving.core.far.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemDto {
    private String glCode;
    private String itemCode;
    private String costHead;
    private String itemName;
    private String itemDescription;
    private String costHeadLabel;
    private String category;
    private String subCategory;
    private String categoryLabel;
    private String subCategoryLabel;
}
