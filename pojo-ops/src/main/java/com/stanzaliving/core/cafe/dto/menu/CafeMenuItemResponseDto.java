package com.stanzaliving.core.cafe.dto.menu;

import com.stanzaliving.core.base.utils.StanzaUtils;
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

    public Double getSgstPercentage() {
        return gstPercentage == null ? 0D : StanzaUtils.roundToPlaces(gstPercentage / 2, 2);
    }

    public Double getCgstPercentage() {
        return gstPercentage == null ? 0D : StanzaUtils.roundToPlaces(gstPercentage / 2, 2);
    }

    public Double getIgstPercentage() {
        return 0D;
    }

    public Double getSgst() {
        return gst == null ? 0D : StanzaUtils.roundToPlaces(gst / 2, 2);
    }

    public Double getCgst() {
        return gst == null ? 0D : StanzaUtils.roundToPlaces(gst / 2, 2);
    }

    public Double getIgst() {
        return 0D;
    }

}
