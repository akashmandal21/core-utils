package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeOrderPlanningRDto {
    private String itemId;
    private String name;
    private String category;
    private String description;
    private String grammage;
    private String packaging;
    private String shelfLife;
    private double gmv;
    private int quantity;
    private boolean quantifiable;
    private String weight;
    private boolean containsEgg;
    private boolean nonVeg;
}
