package com.stanzaliving.core.ims.client.dto;

import com.stanzaliving.core.ims.client.dto.responseDto.BankVerificationResponseDto;
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
public class StoreBankDetailsDto {

    private BankAccountVerificationDto brokerBankAccount;
}
