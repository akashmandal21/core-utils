package com.stanzaliving.core.user.acl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsersByFiltersResponseDto {

    private List<String> cityHeadUuids;
    private List<String> clusterManagerUuids;
    private List<String> salesAssociateUuids;
}
