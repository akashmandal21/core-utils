package com.stanzaliving.housekeepingservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HkUsersDto {
    private String uuid;

    private String userName;

    private String firstname;

    private String middleName;

    private String lastName;
}