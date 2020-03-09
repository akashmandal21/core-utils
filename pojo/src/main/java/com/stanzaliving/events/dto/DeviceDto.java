package com.stanzaliving.events.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Piyush Srivastava
 *
 * @date 09-Mar-2020
 */


@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@Getter
@Setter
public class DeviceDto {
    private String deviceId;

    private String os;

    private String osVersion;

    private String model;

    private String imei;

    private String apiLevel;

    private String display;

}
