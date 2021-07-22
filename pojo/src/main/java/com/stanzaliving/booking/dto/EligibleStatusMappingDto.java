package com.stanzaliving.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EligibleStatusMappingDto {

    private String title;

    private String icon;

    private String status;

    private String colorCode;
}
