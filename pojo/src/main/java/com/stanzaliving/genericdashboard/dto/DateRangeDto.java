package com.stanzaliving.genericdashboard.dto;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DateRangeDto {

    private Date startDate;

    private Date endDate;
}

