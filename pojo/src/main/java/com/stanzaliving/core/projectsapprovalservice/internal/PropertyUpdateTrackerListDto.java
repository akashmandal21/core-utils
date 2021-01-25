package com.stanzaliving.core.projectsapprovalservice.internal;

import com.stanzaliving.core.projectservice.enums.PropertyUpdateEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyUpdateTrackerListDto {
    private String propertyUuid;
    private List<PropertyUpdateEnum> propertyUpdateEnums;
}
