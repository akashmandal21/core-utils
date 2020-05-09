package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "INSTITUTION")
@Data
public class INSTITUTIONEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "CODE", nullable = false)
	@JsonProperty("CODE")
    private String CODE;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED;

    @Column(name = "INSTITUTION_ID", nullable = false)
	@JsonProperty("INSTITUTION_ID")
    private String institutionId;

    @Column(name = "NAME", nullable = false)
	@JsonProperty("NAME")
    private String NAME;

    @Column(name = "POC_EMAIL")
	@JsonProperty("POC_EMAIL")
    private String pocEmail;

    @Column(name = "POC_NAME")
	@JsonProperty("POC_NAME")
    private String pocName;

    @Column(name = "POC_PHONE")
	@JsonProperty("POC_PHONE")
    private String pocPhone;

    @Column(name = "TOTAL_INVENTORY", nullable = false)
	@JsonProperty("TOTAL_INVENTORY")
    private Integer totalInventory;

    @Column(name = "TOTAL_PRICE", nullable = false)
	@JsonProperty("TOTAL_PRICE")
    private Integer totalPrice;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "INSTITUTION_ADDRESS_ID")
	@JsonProperty("INSTITUTION_ADDRESS_ID")
    private Integer institutionAddressId;

    @Column(name = "AGREEMENT_DETAILS", columnDefinition = "text")
	@JsonProperty("AGREEMENT_DETAILS")
    private String agreementDetails;

    @Column(name = "ADVANCE_RENTAL_MONTHS")
	@JsonProperty("ADVANCE_RENTAL_MONTHS")
    private Integer advanceRentalMonths = 0;

    
}