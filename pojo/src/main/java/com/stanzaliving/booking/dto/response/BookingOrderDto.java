package com.stanzaliving.booking.dto.response;

import com.stanzaliving.core.enums.BundleType;
import com.stanzaliving.residenceservice.enums.VasCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookingOrderDto {

    private String orderId;

    private String bookingUuid;

    private String residenceUuid;

    private BundleType bundleType;

    private Double purchaseAmount;

    private String bundleId;

    private String addOnId;

    private String billingPreferenceId;

    private Map<VasCategory, List<StockUnitDetailsDto>> categorySkuDetailsMap;

    private Date effectiveDate;

    private Date endDate;

    private String requestedBy;

    private String parentOrderId;

}
