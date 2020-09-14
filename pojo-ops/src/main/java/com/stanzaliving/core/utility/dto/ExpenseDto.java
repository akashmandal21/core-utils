package com.stanzaliving.core.utility.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseDto extends AbstractDto {
    private String uuid;
    @NotBlank(message = "Type Id Cannot be Blank")
    private String typeId;
    private String name;
    private Date time;
    private Double amount;
    @NotBlank(message = "Bill Photo is mandatory for expense")
    private String image;
    private List<ExpenseDetailsDto> details;
}
