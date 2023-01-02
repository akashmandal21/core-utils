package com.stanzaliving.supportclient.dto;

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
    private String userCode;
    private String userName;
    private String mobile;
    private String currentRoomNo;
    private String currentHostelId;
    private String currentHostelName;

}

