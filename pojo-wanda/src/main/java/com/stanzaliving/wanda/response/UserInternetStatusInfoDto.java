package com.stanzaliving.wanda.response;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInternetStatusInfoDto {
    private String userId;
    private String planName;
    private String fName;
    private String lName;
    private String mobile;
    private String email;
    private String status;
}
