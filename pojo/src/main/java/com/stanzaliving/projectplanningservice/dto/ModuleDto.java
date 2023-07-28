package com.stanzaliving.projectplanningservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author Pradeep Naik R
 * @description DTO for Section Details
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ModuleDto extends AbstractDto {

    private String moduleName;

    private String colorCode;

    private String textColorCode;
}
