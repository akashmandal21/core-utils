package com.stanzaliving.boq_service.dto.groundrequest;

import com.stanzaliving.item_master.enums.ItemType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AreaWiseBreakupDto {

    private BigDecimal itemCount;

    private BigDecimal itemPct;
}
