package com.stanzaliving.estate_v2.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LandlordDetails {
    private String name;
    private String phoneNumber;
    private String email;
    private String UID;
}