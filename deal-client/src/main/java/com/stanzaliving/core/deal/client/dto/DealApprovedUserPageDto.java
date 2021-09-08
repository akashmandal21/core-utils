package com.stanzaliving.core.deal.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DealApprovedUserPageDto {

    private List<DealApprovedUserResponseDto> content;

    private long totalCount;
}
