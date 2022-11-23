
package com.stanzaliving.core.backendlocator.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class StudentDetailsDto {
    private Integer sgst;
    private String lastName;
    private Double totalPenalty;
    private String roomNumber;
    private String qrLink;
    private Double discountAmount;
    private String paymentFrequency;
    private Date actualContractEndDate;
    private Double igst;
    private String parentPhone;
    private Double foodServiceSgst;
    private Double perMonthPricing;
    private String vaNumber;
    private String studentId;
    private Double mandatoryServicePrice;
    private String studentEmail;
    private Double optionalServicePrice;
    private Double foodServicePrice;
    private String upiHandle;
    private String imageURL;
    private Date penaltyDueDate;
    private RentalBreakupDto rentalBreakup;
    private String residenceName;
    private Double foodServiceCgst;
    private Double roomPrice;
    private String parentRelation;
    private Date contractStartDate;
    private Double foodServiceIgst;
    private Date contractEndDate;
    private Double cgst;
    private Double perDayPenalty;
    private String contractPeriod;
    private String firstName;
    private String parentName;
    private Integer numberOfBed;
    private String userUuid;
    private String studentPhone;

}
