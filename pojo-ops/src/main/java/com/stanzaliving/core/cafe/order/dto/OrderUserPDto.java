package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.UserType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OrderUserPDto {
    @NotNull(message = "Empty User Type")
    private UserType userType;
    @NotBlank(message = "Empty User Id")
    private String userId;
    private String phoneNo;
    private String mobileNo;
    private String email;
    private String firstName;
    private String middleName;
    private String lastName;
    private String profilePicture;
    private String residenceId;
    private String residenceName;
    private String roomNo;
    private String residentCode;
}
