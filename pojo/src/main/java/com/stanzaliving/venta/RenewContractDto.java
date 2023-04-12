package com.stanzaliving.venta;

import com.stanzaliving.venta.enums.EventType;
import com.stanzaliving.venta.enums.TaskSubCategory;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RenewContractDto {
    private String taskMappingId;
    private TaskSubCategory taskSubCategory;
    private String taskSubCategoryName;
    private String isFromRenewContractJob;
    private String resolvedByUuid;
    private LocalDateTime resolvedAt;
    private EventType eventType;
    private String residenceUuid;
    private String residenceName;
    private String microMarketUuid;
    private String cityUuid;
    private String userCode;
    private String bookingUuid;
    private LocalDate moveInDate;
    private String bookingResidenceType;
    private String roomNumber;
}
