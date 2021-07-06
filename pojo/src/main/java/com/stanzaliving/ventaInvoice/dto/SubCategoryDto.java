package com.stanzaliving.ventaInvoice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubCategoryDto {
    private String subCategoryUuid;
    private String subCategoryName;
}
