package com.stanzaliving.core.deal.client.dto;

import com.stanzaliving.core.deal.client.enums.UserStatusType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DealUserFilterDto {

    private List<UserStatusType> statusTypes;

    private Integer expectedMoveInDateCount;

    private Integer expectedMoveOutDateCount;
}
