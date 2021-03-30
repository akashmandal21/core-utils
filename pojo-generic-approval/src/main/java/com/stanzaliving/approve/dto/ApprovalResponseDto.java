package com.stanzaliving.approve.dto;

import com.stanzaliving.approve.enums.ApprovalStatus;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApprovalResponseDto {
    @NotNull(message = "entityUuid cannot be null")
    @NotBlank(message = "entityUuid cannot be blank")
    String entityUuid;

    @NotBlank(message = "entity cannot be blank")
    @NotNull(message = "entity cannot be null")
    String entityName;

    //todo: Add validation
    ApprovalStatus approvalStatus;

}
