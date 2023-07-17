package com.stanzaliving.notification.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class FcmTokenDto {

    @NotNull(message = "Application name cannot be null")
    @NotBlank(message = "Application name cannot be blank")
    private String applicationName;

    @NotNull(message = "User id cannot be null")
    @NotBlank(message = "User id cannot be blank")
    private String userId;

    @NotNull(message = "Platform cannot be null")
    @NotBlank(message = "Platform cannot be blank")
    @Pattern(regexp = "IOS|GCM|WEB", message = "Invalid platform")
    private String platform;

    @NotNull(message = "fcm token cannot be null")
    @NotBlank(message = "fcm token cannot be blank")
    private String token;

    @NotNull(message = "Device name cannot be null")
    @NotBlank(message = "Device name cannot be blank")
    private String deviceName;

    private String residenceUuid;

    private String residenceName;

    private String city;

    private String microMarket;
}
