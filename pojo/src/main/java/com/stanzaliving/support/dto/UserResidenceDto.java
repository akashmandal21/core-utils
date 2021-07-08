package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResidenceDto {

    private String userUuid;
    @NotBlank(message = "User code cannot be blank/null")
    private String userCode;
    @NotBlank(message = "User name cannot be blank/null")
    private String userName;
    private String mobile;
    @NotBlank(message = "Room number cannot be blank/null")
    private String currentRoomNo;
    private String currentHostelId;
    @NotBlank(message = "Resident name cannot be blank/null")
    private String currentHostelName;

}

