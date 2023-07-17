package com.stanzaliving.core.oracle.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OracleVendorBankDto {

    @JsonProperty("custentity_xxflx_bank_name")
    private String custentityXxflxBankName;  //set

    @JsonProperty("custentity_xxflx_branch_name")
    private String custentityXxflxBranchName;

    @JsonProperty("custentity_xxflx_bank_branch_address")
    private String custentityXxflxBankBranchAddress;    //set

    @JsonProperty("custentity_xxflx_acc_holder_name")
    private String custentityXxflxAccHolderName;   //set

    @JsonProperty("custentity_xxflx_account_no")
    private String custentityXxflxAccountNo;   //set

    @JsonProperty("custentity_xxflx_ifsc_code")
    private String custentityXxflxIfscCode;   //set

    @JsonProperty("custentity_xxflx_swift_code")
    private String custentityXxflxSwiftCode;   //set

    @JsonProperty("custentity_xxflx_default_acc")
    private String custentityXxflxDefaultAcc;  //set


}
