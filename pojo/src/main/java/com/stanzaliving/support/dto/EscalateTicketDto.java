package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EscalateTicketDto {

    private String name;
    private String email;
    private String team;
    private String userUuid;
    private String message;
    private String role;
    private Integer sequenceNo;
    private Date escalationResolutionDate;

}
