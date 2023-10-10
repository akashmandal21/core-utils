package com.stanzaliving.booking.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Log {

    private String status;

    private Date date;

    private String createdBy;

    private Double refundAmount;

    private Double dueAmount;

    public String utr;
}
