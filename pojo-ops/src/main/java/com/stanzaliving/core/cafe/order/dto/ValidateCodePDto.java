package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ValidateCodePDto {
    @NotNull(message = "Empty Order Id")
    private String uuid;
    @NotNull(message = "Empty Code")
    private String code;
}
