package com.stanzaliving.core.ims.client.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author harman
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BankAccountVerificationDto {

    private String accountName;

    private String accountNumber;

    private String ifscCode;

    private boolean Live;
}
