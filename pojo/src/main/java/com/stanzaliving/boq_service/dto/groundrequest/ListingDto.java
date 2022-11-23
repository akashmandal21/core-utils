package com.stanzaliving.boq_service.dto.groundrequest;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListingDto {
    private String groupBy;

    private Integer count;

    private List<ItemDto> items;
}
