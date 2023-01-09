package com.stanzaliving.wanda.dtos;

import com.stanzaliving.wanda.enums.BankNames;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankDetailsResponse {

    @NotEmpty
    private String accountNumber;

    private BankNames bankNames;

    private String bankNameStr;

    @NotEmpty
    private String ifscCode;

    @NotEmpty
    private String beneficiaryName;

    @Builder.Default
    private Boolean isVerified = false;

    private String bankBranch;

}

