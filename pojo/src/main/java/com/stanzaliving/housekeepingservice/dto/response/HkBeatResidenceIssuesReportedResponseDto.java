package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;

import java.util.List;

/**
 * @author Anudeep Alevoor
 **/

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class HkBeatResidenceIssuesReportedResponseDto {

    private String residenceUuid;

    private String residenceName;

    private String roomNumber;

    private String roomUuid;

    private List<HkBeatResidenceTicketsResponseDto> tickets;
}
