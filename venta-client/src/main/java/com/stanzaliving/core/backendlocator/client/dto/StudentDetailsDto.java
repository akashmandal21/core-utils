
package com.stanzaliving.core.backendlocator.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class StudentDetailsDto {
    private Integer sgst;
    private String lastName;
    private Object totalPenalty;
    private String roomNumber;
    private String qrLink;
    private Object discountAmount;
    private String paymentFrequency;
    private Object actualContractEndDate;
    private Integer igst;
    private String parentPhone;
    private Integer foodServiceSgst;
    private Integer perMonthPricing;
    private String vaNumber;
    private String studentId;
    private Integer mandatoryServicePrice;
    private String studentEmail;
    private Integer optionalServicePrice;
    private Integer foodServicePrice;
    private String upiHandle;
    private String imageURL;
    private Object penaltyDueDate;
    private RentalBreakupDto rentalBreakup;
    private String residenceName;
    private Integer foodServiceCgst;
    private Integer roomPrice;
    private String parentRelation;
    private Integer contractStartDate;
    private Integer foodServiceIgst;
    private Integer contractEndDate;
    private Integer cgst;
    private Object perDayPenalty;
    private String contractPeriod;
    private String firstName;
    private String parentName;
    private Integer numberOfBed;
    private String userUuid;
    private String studentPhone;

}
