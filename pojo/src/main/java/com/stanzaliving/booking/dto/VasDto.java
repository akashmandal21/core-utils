package com.stanzaliving.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VasDto {

    private  String vasUuid;
    private Date optInDate;
    private  Date optOutDate;
}
