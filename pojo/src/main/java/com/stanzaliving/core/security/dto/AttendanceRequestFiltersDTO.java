package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.security.enums.RequestStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceRequestFiltersDTO {

    private List<RequestStatus> requestStatusList;
}
