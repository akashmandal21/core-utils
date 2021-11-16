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
public class HkBeatVendorResponseDto {

    private String vendorName;

    private Double hps;

    private Integer ratings;

    private Double delighted;

    private Double disgusted;

    private Integer issues;
}
