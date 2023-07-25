package com.stanzaliving.projectplanningservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author Anudeep Alevoor
 * @description DTO for Planning template created by
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PropertyFilterAddedByDto {

    private String userUuid;

    private String userFirstName;

    private String userMiddleName;

    private String userLastName;
}
