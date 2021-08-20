package com.stanzaliving.core.generic.itemmaster.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TimeAndDoneByDto {

    private Date time;
    private String doneBy;
}
