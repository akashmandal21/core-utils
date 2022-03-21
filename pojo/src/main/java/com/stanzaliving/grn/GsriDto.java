package com.stanzaliving.grn;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class GsriDto {

    private String gsriId;
    private Date gsriDate;
    private BigDecimal gsriQuantity;
}
