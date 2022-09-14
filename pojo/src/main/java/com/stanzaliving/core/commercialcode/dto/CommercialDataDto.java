package com.stanzaliving.core.commercialcode.dto;

import com.stanzaliving.booking.enums.BookingSubType;
import com.stanzaliving.core.enums.PlatformType;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class CommercialDataDto {
   private String commercialId;
   private String commercialName;
   private List<CommercialMetaDataDto> commercialData;
   private boolean disabled;
   private boolean autoApplicable;
   private List<String> applicabilityCriteria;
   private PlatformType platformType;
   private BookingSubType bookingSubType;
   private Date commercialCodeCreatedAt;
}
