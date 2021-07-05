package com.stanzaliving.community.response;

import lombok.*;

import java.util.Date;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DateRangeResponseDTO {
    private Date startDate;
    private Date endDate;
}
