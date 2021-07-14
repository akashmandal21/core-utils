package com.stanzaliving.wanda.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class KYCRejectionOptionDto {

    private String uuid;
    private String option;
}
