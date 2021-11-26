package com.stanzaliving.housekeepingservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class AreaRoomFilterDto {
    private String areaRoomNumber;

    private String residenceUuid;

    private String orderByColumnName;

    private String orderBy;

    private PaginationRequest pageRequest;

    private String areaTagUuid;

    private String categoryUuid;
}