package com.stanzaliving.core.cafe.dto.menu;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMenuItemRequestDto {
    private static final long serialVersionUID = 1L;
    protected boolean featured;
    protected boolean deliveryAllowed;
    protected boolean diningAllowed;
    protected boolean pickUpAllowed;
    private String itemId;

}
