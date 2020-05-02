package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "STUDENT_CURRENT_COMMERCIALS")
public class StudentCurrentCommercials implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "BOOKING_ID", nullable = false)
    private Integer bookingId;

    @Column(name = "ADMIN_CHARGES")
    private Double adminCharges;

    @Column(name = "MANDATORY_SERVICE_PRICE")
    private Double mandatoryServicePrice;

    @Column(name = "NON_REFUNDABLE_SECURITY")
    private Double nonRefundableSecurity;

    @Column(name = "OPTIONAL_SERVICE_PRICE")
    private Double optionalServicePrice;

    @Column(name = "REFUNDABLE_SECURITY")
    private Double refundableSecurity;

    @Column(name = "ROOM_PRICE")
    private Double roomPrice;

    @Column(name = "TOTAL_AMOUNT")
    private Double totalAmount;

    @Column(name = "DISCOUNT_ID")
    private String discountId;

    @Column(name = "CGST")
    private Double CGST;

    @Column(name = "IGST")
    private Double IGST;

    @Column(name = "SGST")
    private Double SGST;

    @Column(name = "ADVANCE_RENTAL_MONTHS")
    private Integer advanceRentalMonths;

    @Column(name = "VAS_PRICE")
    private Double vasPrice = 0D;

    @Column(name = "VERSION", nullable = false)
    private Integer VERSION;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "TYPE")
    private String TYPE;

    
}