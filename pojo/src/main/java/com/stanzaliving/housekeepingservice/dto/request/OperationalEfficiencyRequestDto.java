package com.stanzaliving.housekeepingservice.dto.request;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * @author Vikas S T
 * @date 17-Jan-22
 **/

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class OperationalEfficiencyRequestDto {
    private String microClusterUuid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    private int numOfDays;
}
