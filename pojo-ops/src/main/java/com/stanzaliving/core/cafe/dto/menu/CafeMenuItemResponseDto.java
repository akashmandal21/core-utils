package com.stanzaliving.core.cafe.dto.menu;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMenuItemResponseDto extends AbstractDto {
    private static final long serialVersionUID = 1L;

    private boolean featured;
    private boolean deliveryAllowed;
    private boolean diningAllowed;
    private boolean pickUpAllowed;
    private boolean discountAllowed;
    private boolean visible;
    private Double discount;
    private String itemId;
    private String description;
    private String name;
    private Double price;
    private Double ratings;
    private boolean containsEgg;
    private boolean nonVeg;

}
