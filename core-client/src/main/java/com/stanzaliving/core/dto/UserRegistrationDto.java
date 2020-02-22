package com.stanzaliving.core.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationDto {

        private String userId;
        private String status;
        private String type;

}
