package com.stanzaliving.agreement.dto.response;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SignerDto {
    private String pincode;
    private String uid;
    private String serialNumber;
    private String gender;
    private String name;
    private String state;
    private String title;
    private String yob;
    private String photoHash;
}
