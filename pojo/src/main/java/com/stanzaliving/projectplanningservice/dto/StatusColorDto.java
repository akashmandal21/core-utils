package com.stanzaliving.projectplanningservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author  Ranjith Kumar Jain
 * @description DTO for Status Color
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class StatusColorDto extends AbstractDto {

    private String statusUuid;

    private String colorCode;
}
