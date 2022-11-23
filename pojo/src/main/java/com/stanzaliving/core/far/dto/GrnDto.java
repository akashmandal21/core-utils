package com.stanzaliving.core.far.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.Date;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class GrnDto extends AbstractDto {
    private String poNumber;
    private String grnId;
    private String itemCode;
    private BigDecimal grnQuantity;
    private Date oldestGrnTimestamp;
    //private BigDecimal assetQuantity;
}
