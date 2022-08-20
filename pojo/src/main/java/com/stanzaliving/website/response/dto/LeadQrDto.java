package com.stanzaliving.website.response.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LeadQrDto {

    private String phone;

    private String firstName;

    private String lastName;

    private String email;

    private Integer residenceId;

    private boolean phoneVerified;

    private boolean validRequest;

    private String residenceName;

    private String sessionId;

    private Boolean whatsappnotification = false;

    private Boolean optedInWhatsApp = false;

}
