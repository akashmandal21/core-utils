package com.stanzaliving.core.cafe.dto.menu;

import com.stanzaliving.core.cafe.dto.CafeVasItemDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMenuItemResponseDto {
    private static final long serialVersionUID = 1L;

    private boolean featured;
    private boolean deliveryAllowed;
    private boolean diningAllowed;
    private boolean pickUpAllowed;
    private boolean dealOn;
    private boolean visibleInMenu;
    private Double discount;
    private String itemId;

    //from vas master
    private CafeVasItemDto itemDetails;

    private Map<String, Double> ratings;
    private Map<String, Double> orders;

    //from cafe pricing
    private Double price;
    private Double gstPercentage;
    private Double gst;
    private Double finalPrice;
    private Double marginPercentage;
    private boolean disableAtCafe;

}
