package com.stanzaliving.wanda.dtos;

import java.util.Date;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FullUserDto {

    private int id;
    private String userUuid;
    private String mobileNumber;
    private String password;
    private String fullName;
    private String email;
    private Boolean state;
    private Date birthDay;
    private String uuid;
    private String gender;
    private String bloodGroup;
    private String foodPreference;
    private String roomNumber;
    private String imgUrl;
    private HostelDto hostelDto;
    private Date preferredInTime;
    private String userCode;
    private Boolean isBlocked = false;
    private Boolean tifinActive = false;
    private String collegeName;
}
