package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.ServingMode;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMenuPDto {
    @NotBlank(message = "Empty Cafe Id")
    private String cafeId;
    private String residenceId;
    private ServingMode mode;
}
