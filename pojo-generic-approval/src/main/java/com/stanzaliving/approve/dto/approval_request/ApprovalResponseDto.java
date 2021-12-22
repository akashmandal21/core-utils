package com.stanzaliving.approve.dto.approval_request;

import com.stanzaliving.approve.enums.ApprovalStatus;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.HashMap;

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
    private String entityUuid;

    @NotBlank(message = "entity cannot be blank")
    @NotNull(message = "entity cannot be null")
    private String entityName;

    @Pattern(regexp = "APPROVED|REJECTED",
            message = "Invalid approval status type")
    String approvalStatus;

    private String comment;

    private HashMap<String, Object> metadata;

    private String approvedBy;
}
