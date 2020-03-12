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
public class CustomDto {
    private String key1;
    private String val1;

    private String key2;
    private String val2;

    private String key3;
    private String val3;

    private String key4;
    private String val4;

    private String key5;
    private String val5;

}
