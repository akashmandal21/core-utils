package com.stanzaliving.core.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RCDetailDto {

    private Integer userId;
    private String mobileNumber;
    private Integer hostelId;

}
