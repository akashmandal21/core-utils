package com.stanzaliving.po.model;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class SwimPoToShortCloseDto {

    private boolean isScRequest;
    private String poUuid;
    private String shortCloseReason;
    private ItemsBreakupDto itemsBreakupDto;
}
