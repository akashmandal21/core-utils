package com.stanzaliving.core.payment.dto;

import com.stanzaliving.core.payment.enums.MessageType;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.Date;
import javax.validation.constraints.NotBlank;
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RBLDataDTO {

    private MessageType messageType;

    @NotNull(message="Amount cannot be blank")
    private double amount;

    @NotBlank(message="UTRNUMBER cannot be blank")
    private String utrNumber;

    @NotBlank(message="Sender IFSC cannot be blank")
    private String senderIFSC;

    @NotBlank(message="Account Number cannot be blank")
    private String senderAccountNumber;

    private String senderAccountType;

    @NotBlank(message="Sender Name cannot be blank")
    private String senderName;

    private String beneficiaryAccountType;

    @NotBlank(message="Beneficiary Account Number cannot be blank")
    private String beneficiaryAccountNumber;

    @NotNull(message="Credit date cannot be blank")
    private Date creditDate;

    @NotBlank(message="Credit Account Number cannot be blank")
    private String creditAccountNumber;

    private String corporateCode;

    private String clientCodeMaster;

    private String senderInformation;
}
