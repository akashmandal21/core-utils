package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleDataDto {
    private Department department;
    private List<String> cityUuids;
    private List<String> micromarketUuids;
    private List<String> residenceUuids;
    private String vendorRole;
}
