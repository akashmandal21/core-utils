package com.stanzaliving.community.response;

import com.stanzaliving.core.user.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsResponseDTO {
    private String eventID;
    private String name;
    private String eventType;
    private Date startDate;
    private Long id;
    private String userUUID;
    private String residentName;
    private String email;
    private String mobile;
    private String gender;
    private String residenceName;
    private String microMarketName;
    private String cityName;
    private String responseTimeStamp;
}