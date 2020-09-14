package com.stanzaliving.core.utility.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseDetailsDto extends AbstractDto {
    private Integer capacity;
    @Min(value = 0, message = "Rate Cannot Be Less Than Zero")
    private Double rate;
    @Min(value = 0, message = "Quantity Cannot Be Less Than Zero")
    private Double quantity;
    private Double amount;
}
