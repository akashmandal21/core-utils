package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.UserType;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeOrderUserRDto {
    private UserType userType;
    private String name;
    private String email;
    private String mobileNo;
    private String userId;
    private String residenceId;
    private String residenceName;
    private String roomNo;
    private String image;

}
