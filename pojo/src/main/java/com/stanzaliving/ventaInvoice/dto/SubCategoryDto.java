package com.stanzaliving.ventaInvoice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubCategoryDto {
    private String subCategoryUuid;
    private String categoryName;
}
