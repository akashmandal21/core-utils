package com.stanzaliving.search.medulla.dtos;


import com.stanzaliving.core.dto.PageAndSortDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PoSearchRequetDto {
    private String poNumber;
    private Boolean po;
    private String deliveryLocationUuid;
    private String deliveryLocationType;
    private PageAndSortDto pageDto;
    private Boolean dataComplete;
}
