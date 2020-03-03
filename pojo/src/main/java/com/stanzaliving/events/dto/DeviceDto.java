package com.stanzaliving.events.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@Getter
@Setter
public class DeviceDto {
    private String deviceId;

    private String os;

    private String os_version;

    private String model;

    private String imei;

    private String apiLevel;

    private String display;

}
