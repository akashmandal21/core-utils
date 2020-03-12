package com.stanzaliving.events.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;


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
public class AppDto {

    @NotEmpty(message = "appName must not be empty")
    private String appName;

    @NotEmpty(message = "application version must not be empty")
    private String version;

    private DeviceDto deviceDto;
}
