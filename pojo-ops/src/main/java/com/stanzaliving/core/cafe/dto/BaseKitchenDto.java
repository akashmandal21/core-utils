package com.stanzaliving.core.cafe.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BaseKitchenDto implements Serializable {

    private String kitchenId;

    private String kitchenName;

    private boolean primaryKitchen;
    
}