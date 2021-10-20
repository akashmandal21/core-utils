package com.stanzaliving.projectplanningservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author Pradeep Naik R
 * @description Request DTO for CRUD operation on notes for mobile app
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class MobileNotesRequestDto {

    @NotBlank(message = "Notes name should not be blank")
    private String noteName;

    @NotBlank(message = "Note Message should not be blank")
    private String noteBody;

    @NotBlank(message = "Owner uuid is required")
    private String ownerUuid;

}
