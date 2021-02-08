package com.stanzaliving.wanda.dtos;

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
    private String userUuid;
    private String userName;
    private String password;
    private Boolean status;
    private String mobileNo;
    private String hostel;
    private Integer hostelID;
    private List<String> userProfiles;
    private String userCode; 
    private String room; 
    private String image;
    private String email;
    private String managerContact;
    private String residenceAddressId;
    private String collegeName;
    private String currentResidenceUuid;
   
}
