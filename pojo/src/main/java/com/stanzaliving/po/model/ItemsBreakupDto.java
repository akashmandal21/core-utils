package com.stanzaliving.po.model;


import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ItemsBreakupDto {
    private String itemUuid;
    private int existingQty;
    private int updatedQty;
}
