package com.stanzaliving.core.cafe.dto.menu;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMenuItemRequestDto {
    private static final long serialVersionUID = 1L;
    private boolean featured;
    private boolean deliveryAllowed;
    private boolean diningAllowed;
    private boolean pickUpAllowed;
    private boolean dealOn;
    private boolean visibleInMenu;
    private Double discount;
    @NotNull(message = "Empty Item Id")
    private String itemId;

}
