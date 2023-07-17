package com.stanzaliving.core.payment.dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VirtualAccountMigratedDto {
    private String userUuid;

    private String studentId;

    private String vaNumber;

}
