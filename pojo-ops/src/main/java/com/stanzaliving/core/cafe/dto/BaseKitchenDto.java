package com.stanzaliving.core.cafe.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BaseKitchenDto {

    private String kitchenId;

    private String kitchenName;

    private boolean primaryKitchen;
}