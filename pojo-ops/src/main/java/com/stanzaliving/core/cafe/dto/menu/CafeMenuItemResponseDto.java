package com.stanzaliving.core.cafe.dto.menu;

import com.stanzaliving.core.base.utils.StanzaUtils;
import com.stanzaliving.core.cafe.dto.CafeVasItemDto;
import com.stanzaliving.core.cafe.enums.CafeMenuItemDurationType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.EnumMap;

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

    private EnumMap<CafeMenuItemDurationType, Double> ratings;
    private EnumMap<CafeMenuItemDurationType, Integer> orders;

    //from cafe pricing
    private Double price;
    private Double gstPercentage;
    private Double gst;
    private Double finalPrice;
    private Double marginPercentage;
    private boolean disableAtCafe;

    public Double getSgstPercentage() {
        return gstPercentage == null ? 0D : StanzaUtils.roundToPlaces(gstPercentage / 2, 2);
    }

    public Double getCgstPercentage() {
        return gstPercentage == null ? 0D : StanzaUtils.roundToPlaces(gstPercentage / 2, 2);
    }

    public Double getIgstPercentage() {
        return 0D;
    }

}
