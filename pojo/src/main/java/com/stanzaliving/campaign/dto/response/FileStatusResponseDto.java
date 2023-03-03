package com.stanzaliving.campaign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class FileStatusResponseDto {
    boolean isComplete;
    String fileStatus;
    String fileUrl;
    long createdAt;
    boolean isExpired;
    boolean isGenerated;
}
