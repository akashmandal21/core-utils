package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class HkBeatResidenceTicketsResponseDto {

    private String ticketStatus;

    private String issueText;

    private String ticketUuid;

    private LocalDate reportedDate;
}
