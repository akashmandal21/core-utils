package com.stanzaliving.venta;

import com.stanzaliving.venta.enums.EventType;
import com.stanzaliving.venta.enums.TaskSubCategory;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonthlyRentDto {
    private String taskMappingId;
    private TaskSubCategory taskSubCategory;
    private String taskSubCategoryName;
    private String isFromRentDueJob;
    private String resolvedByUuid;
    private LocalDateTime resolvedAt;
    private EventType eventType;
    private String microMarketUuid;
    private String residenceUuid;
    private String residenceName;
    private String userCode;
    private String bookingUuid;
    private Double duesOfCurrentMonth;
    private Double previousArrears;
    private Double paidThisMonth;
    private Double currentOutstanding;
}
