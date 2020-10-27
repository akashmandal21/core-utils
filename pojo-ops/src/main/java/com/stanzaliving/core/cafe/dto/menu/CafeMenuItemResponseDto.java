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
    protected boolean featured;
    protected boolean deliveryAllowed;
    protected boolean diningAllowed;
    protected boolean pickUpAllowed;
    private String itemId;

}
