package com.stanzaliving.core.projectservice.tiles;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.projectservice.enums.PropertyUpdateEnum;
import com.stanzaliving.core.user.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TileDeciderDto {
    private String propertyUuid;
    private UserType userType;
    private Department department;
    private List<PropertyUpdateEnum> propertyUpdateEnums;
}
