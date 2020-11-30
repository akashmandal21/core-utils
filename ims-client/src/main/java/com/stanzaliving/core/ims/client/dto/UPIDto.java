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
public class UPIDto {

    private PayoutMode payoutMode;

    private String vpaAddress;
}
