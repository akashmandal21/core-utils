package com.stanzaliving.core.residenceservice.dto;


import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MatrixDto {
    private Date toDate;
    private String residenceUUID;
    private Double beds;
    private Double underWritePrice;
    private Double soldUnderWritePrice;
    private Double actualSoldUnderWrite;
    private Double actualClusterSoldUnderWrite;
}
