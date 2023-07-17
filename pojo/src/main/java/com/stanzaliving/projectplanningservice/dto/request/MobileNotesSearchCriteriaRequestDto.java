package com.stanzaliving.projectplanningservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author Pradeep Naik R
 * @description Request DTO for CRUD operation on notes for mobile app
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class MobileNotesSearchCriteriaRequestDto {

    private String noteName;

    private String ownerUuid;

}
