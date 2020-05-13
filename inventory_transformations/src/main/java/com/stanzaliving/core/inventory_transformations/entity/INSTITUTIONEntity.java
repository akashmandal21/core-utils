package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "INSTITUTION")
@Data
public class InstitutionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "CODE", nullable = false)
	@JsonProperty("code")
    private String CODE;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("enabled")
    private Boolean ENABLED;

    @Column(name = "INSTITUTION_ID", nullable = false)
	@JsonProperty("institution_id")
    private String institutionId;

    @Column(name = "NAME", nullable = false)
	@JsonProperty("name")
    private String NAME;

    @Column(name = "POC_EMAIL")
	@JsonProperty("poc_email")
    private String pocEmail;

    @Column(name = "POC_NAME")
	@JsonProperty("poc_name")
    private String pocName;

    @Column(name = "POC_PHONE")
	@JsonProperty("poc_phone")
    private String pocPhone;

    @Column(name = "TOTAL_INVENTORY", nullable = false)
	@JsonProperty("total_inventory")
    private Integer totalInventory;

    @Column(name = "TOTAL_PRICE", nullable = false)
	@JsonProperty("total_price")
    private Integer totalPrice;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "INSTITUTION_ADDRESS_ID")
	@JsonProperty("institution_address_id")
    private Integer institutionAddressId;

    @Column(name = "AGREEMENT_DETAILS", columnDefinition = "text")
	@JsonProperty("agreement_details")
    private String agreementDetails;

    @Column(name = "ADVANCE_RENTAL_MONTHS")
	@JsonProperty("advance_rental_months")
    private Integer advanceRentalMonths = 0;

    
}