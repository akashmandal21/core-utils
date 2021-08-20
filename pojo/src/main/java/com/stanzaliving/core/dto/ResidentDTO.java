package com.stanzaliving.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResidentDTO {
    private String uuid;

    private String firstName;

    private String lastName;

    private String mobileNumber;

    private String residentCode;
}