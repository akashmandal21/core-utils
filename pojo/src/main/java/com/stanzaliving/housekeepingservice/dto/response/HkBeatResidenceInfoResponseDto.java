package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;

/**
 * @author Anudeep Alevoor
 **/

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class HkBeatResidenceInfoResponseDto {

    private Integer occRooms;

    private Double hps;

    private Integer ratings;

    private Double delighted;

    private Integer issues;
}
