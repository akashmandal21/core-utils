package com.stanzaliving.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EligibleStatusMappingDto  implements Serializable {

    private String title;

    private String icon;

    private String status;

    private String colorCode;
}
