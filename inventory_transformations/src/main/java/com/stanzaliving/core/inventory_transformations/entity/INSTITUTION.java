package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "INSTITUTION")
public class INSTITUTION implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "CODE", nullable = false)
    private String CODE;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED;

    @Column(name = "INSTITUTION_ID", nullable = false)
    private String institutionId;

    @Column(name = "NAME", nullable = false)
    private String NAME;

    @Column(name = "POC_EMAIL")
    private String pocEmail;

    @Column(name = "POC_NAME")
    private String pocName;

    @Column(name = "POC_PHONE")
    private String pocPhone;

    @Column(name = "TOTAL_INVENTORY", nullable = false)
    private Integer totalInventory;

    @Column(name = "TOTAL_PRICE", nullable = false)
    private Integer totalPrice;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "INSTITUTION_ADDRESS_ID")
    private Integer institutionAddressId;

    @Column(name = "AGREEMENT_DETAILS")
    private String agreementDetails;

    @Column(name = "ADVANCE_RENTAL_MONTHS")
    private Integer advanceRentalMonths = 0;

    
}