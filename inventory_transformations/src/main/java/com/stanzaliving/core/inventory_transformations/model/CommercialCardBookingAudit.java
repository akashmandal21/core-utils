package com.stanzaliving.core.inventory_transformations.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Builder
@Data
@Entity
@Table(name = "COMMERCIAL_CARD_BOOKING_AUDIT")
public class CommercialCardBookingAudit {
	
	@Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "REFUNDABLE_SECURITY")
    private Double refundableSecurity;

    @Column(name = "MONTHLY_MAINTENANCE_FEE")
    private Double monthlyMaintenanceFee;

    @Column(name = "ANNUAL_MAINTENANCE_FEE")
    private Double annualMaintenanceFee;

    @Column(name = "ADVANCE_RENTAL_MONTHS")
    private Integer advanceRentalMonths;
    
    @Column(name = "VARIABLE_SECURITY_DEPOSIT")
    private Double variableSecurityDeposit;
    
    @Column(name = "COMMERCIAL_CARD_ID")
    private Integer commercialCardId;
    
    @Column(name = "BOOKING_ID")
    private Integer bookingId;
    
    @Column(name = "CREATED_BY")
    private String createdBy;


}
