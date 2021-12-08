package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class CustomerExperienceDto {

    private int feedbacks;

    private int hps;

    private int totalRooms;

    private int totalIssuesInRooms;

    private double issuesPerRoom;

    private int days;


}
