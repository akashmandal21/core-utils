package com.stanzaliving.core.projectservice.dto;
import lombok.*;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserVirtualAccountDetailsDto {
    private String userId;
    private String studentId;
    private String vaNumber;
    private String bankName;
    private String branchName;
    private String ifscCode;
    private String accountType;
    private String beneficiaryName;
}
