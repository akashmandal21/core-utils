package com.stanzaliving.support.dto;

import com.stanzaliving.core.user.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {

    private String userUuid;
    private String userCode;
    private String mobile;
    private String currentRoomNo;
    private String hostelName;
    private String hostelUuid;
    private String email;
    private String userName;
    private UserType userType;

}
