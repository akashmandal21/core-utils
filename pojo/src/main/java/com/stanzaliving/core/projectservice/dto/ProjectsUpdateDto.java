package com.stanzaliving.core.projectservice.dto;

import com.stanzaliving.core.projectservice.enums.PropertyUpdateEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProjectsUpdateDto {
    String propertyUuid;
    PropertyUpdateEnum propertyUpdateEnum;
}
