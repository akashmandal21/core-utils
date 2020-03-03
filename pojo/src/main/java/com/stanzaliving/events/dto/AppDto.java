package com.stanzaliving.events.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;


@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@Getter
@Setter
public class AppDto {

    @NotEmpty
    private String appName;

    @NotEmpty
    private String version;

    private DeviceDto deviceDto;
}
