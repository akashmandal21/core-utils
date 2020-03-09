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
    private String Key1;
    private String Val1;

    private String Key2;
    private String Val2;

    private String Key3;
    private String Val3;

    private String Key4;
    private String Val4;

    private String Key5;
    private String Val5;

}
