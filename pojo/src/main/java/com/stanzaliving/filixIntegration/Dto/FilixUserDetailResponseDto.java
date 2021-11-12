package com.stanzaliving.filixIntegration.Dto;

import com.stanzaliving.core.bookingservice.dto.PhoneNumberDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilixUserDetailResponseDto {
    private String userCode;
    private PhoneNumberDto mobile;
    private String email;
    private String profilePicture;
    private String firstName;
    private String lastName;
    private String birthday;
    private String gender;
    private String userUuid;
}
