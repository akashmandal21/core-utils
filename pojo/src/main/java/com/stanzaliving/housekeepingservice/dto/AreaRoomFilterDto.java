package com.stanzaliving.housekeepingservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.*;

import java.util.List;

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

    private List<String> areaTagUuids;

    private List<String> categoryUuids;
}