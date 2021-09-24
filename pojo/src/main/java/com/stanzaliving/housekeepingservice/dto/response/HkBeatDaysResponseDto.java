package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Vikas S T
 * @date 03-Sep-21
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class HkBeatDaysResponseDto {
    private LocalDate date;
    private String day;
    private String duration;
    private List<HkBeatPersonResponseDto> hkPersons;

}
