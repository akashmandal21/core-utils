package com.stanzaliving.smartlock.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@SuperBuilder
public class CredentialsRequestDto {

    String mobileNo;
    String secretKey;

}
