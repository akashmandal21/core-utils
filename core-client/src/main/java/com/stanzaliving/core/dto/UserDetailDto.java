package com.stanzaliving.core.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailDto {
    private int userId;
    private String userName;
    private String password;
    private String status;
    private String mobileNo;
    private String hostel;
    private int hostelID;
    private List<String> userProfiles;
    private String userCode;
    private String room;
    private String image;
    private String email;
    private String managerContact;
    private String residenceAddressId;
}
