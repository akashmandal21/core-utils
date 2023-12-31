package com.stanzaliving.core.commercialcode.dto;

import com.stanzaliving.booking.enums.BookingSubType;
import com.stanzaliving.booking.enums.PaymentFrequency;
import lombok.Data;

import java.util.List;

@Data
public class CommercialDataDto {
   private String commercialId;
   private String commercialName;
   private List<CommercialMetaDataDto> commercialData;
   private boolean disabled;
   private boolean autoApplicable;
   private List<String> applicabilityCriteria;
   private BookingSubType bookingSubType;
   private PlatformType platform;
   private PaymentFrequency paymentFrequency;
   private Double monthlyRent;
   private String showMonthlyRent;
   private Double monthlyRentWithPriceImpact;
   private Double priceImpact;
   private Double tenureSortKey;
   private Double gstWithPriceImpact;
   private Double gstPercentageLabel;
   private Double monthlyRentWithoutGstLabel;

}
