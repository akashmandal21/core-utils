package com.stanzaliving.approve.dto;

import com.stanzaliving.approve.enums.RequestType;
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
    @NotBlank(message = "entityUuid cannot be blank")
    String entityUuid;

    @NotNull(message = "requestType cannot be null")
    RequestType requestType;

    @NotNull(message = "approvalEntityType cannot be null")
    ApprovalStatus approvalStatus;

}
