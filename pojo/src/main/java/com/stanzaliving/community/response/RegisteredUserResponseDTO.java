package com.stanzaliving.community.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisteredUserResponseDTO {
    private String firstName;
    private String lastName;
    private String middleName;
    private String profilePicture;
}
