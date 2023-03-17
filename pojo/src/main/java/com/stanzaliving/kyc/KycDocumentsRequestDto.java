package com.stanzaliving.kyc;

import com.stanzaliving.core.enums.ApprovalStatus;
import com.stanzaliving.core.enums.DocumentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KycDocumentsRequestDto {

    @NotEmpty
    private List<String> bookingUuid;

    private DocumentTypeEnum documentType;

    private List<ApprovalStatus> approvalStatus;

}
