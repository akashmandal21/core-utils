package com.stanzaliving.po.model;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class SwimPoToShortCloseDto {

    private boolean isScRequest;
    private boolean isCancelRequest;
    private String poUuid;
    private String shortCloseReason;
    private String docUrl;
    private List<ItemsBreakupDto> itemsBreakupDto;
}
