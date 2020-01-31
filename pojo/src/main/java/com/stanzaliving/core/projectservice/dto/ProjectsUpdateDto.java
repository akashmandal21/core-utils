package com.stanzaliving.core.projectservice.dto;

import com.stanzaliving.core.projectservice.enums.PropertyUpdateEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
public class ProjectsUpdateDto {
    String propertyUuid;
    PropertyUpdateEnum propertyUpdateEnum;
}
