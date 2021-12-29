package com.stanzaliving.projectplanningservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author Pradeep Naik R
 * @description DTO for CRUD operation on notes for mobile app
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class MobileNotesDto extends AbstractDto {

    /**
     * @description added validation for Update operation
     */
    @NotBlank(message = "UUID should not be blank")
    protected String uuid;

    private String noteName;

    private String noteBody;

    /**
     * @description added validation for Update operation
     */
    @NotBlank(message = "Owner uuid cannot be empty")
    private String ownerUuid;
}
