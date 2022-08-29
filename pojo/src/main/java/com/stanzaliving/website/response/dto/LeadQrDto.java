package com.stanzaliving.website.response.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LeadQrDto implements Serializable{

    private static final long serialVersionUID = 1L;

    private String phone;

    private String firstName;

    private String lastName;

    private String email;

    private Integer residenceId;

    private boolean phoneVerified;

    private boolean validRequest;

    private String residenceName;

    private String sessionId;

    @Builder.Default
    private Boolean whatsappnotification = false;

    @Builder.Default
    private Boolean optedInWhatsApp = false;

}
