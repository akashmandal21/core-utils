package com.stanzaliving.core.cafe.dto.menu;

import com.stanzaliving.core.base.utils.StanzaUtils;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeItemPriceDto {
    private String itemId;
    private Double finalPrice;
    private Double gstPercentage;
    private Double price;
    private Double marginPercentage;
    private Double gst;
    private boolean disableOnCafe;

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
