package com.stanzaliving.wanda.response;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KYCApprovalResponseDto {
    @NotNull(message = "kycDocumentUuid cannot be null")
    @NotBlank(message = "kycDocumentUuid cannot be blank")
    private String kycDocumentUuid;

    @Pattern(regexp = "APPROVED|REJECTED",
            message = "Invalid approval status type")
    String approvalStatus;

    @Length(max = 50, message = "Max length of comment is 50")
    private String comment;

}
