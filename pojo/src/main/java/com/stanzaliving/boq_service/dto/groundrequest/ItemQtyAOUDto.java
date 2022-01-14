package com.stanzaliving.boq_service.dto.groundrequest;


import com.stanzaliving.transformations.enums.AreaOfUse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemQtyAOUDto {

    @NotNull(message = "Quantity can not be null")
    private BigDecimal quantity;

    @NotBlank(message = "Area of use can not be blank")
    private AreaOfUse areaOfUse;

}
