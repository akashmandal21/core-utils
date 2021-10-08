package com.stanzaliving.projectplanningservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author Anudeep Alevoor
 * @description DTO for Planning template List
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PlaningTemplateByNameDto {

    private String templateUuid;

    private String templateName;

}
