package com.stanzaliving.smartlock.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@SuperBuilder
public class CredentialsResponseDto {

    Boolean success;
    String type;
    String accessToken;
    String refreshToken;
    Long accessTokenExpiry;

}
