package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "ROOM_PRICING_AUDIT")
@Data
@Entity
public class RoomPricingAuditEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "ROOM_PRICING_AUDIT_ID", nullable = false)
	@JsonProperty("ROOM_PRICING_AUDIT_ID")
    private Integer roomPricingAuditId;

    @Column(name = "ROOM_ID", nullable = false)
	@JsonProperty("ROOM_ID")
    private Integer roomId;

    @Column(name = "ATTRIBUTES_PRICE")
	@JsonProperty("ATTRIBUTES_PRICE")
    private Integer attributesPrice;

    @Column(name = "BASE_PRICE", nullable = false)
	@JsonProperty("BASE_PRICE")
    private Integer basePrice;

    @Column(name = "BUFFER_PRICE", nullable = false)
	@JsonProperty("BUFFER_PRICE")
    private Integer bufferPrice;

    @Column(name = "MANDATORY_SERVICES_PRICE", nullable = false)
	@JsonProperty("MANDATORY_SERVICES_PRICE")
    private Integer mandatoryServicesPrice;

    @Column(name = "ROOM_PRICE", nullable = false)
	@JsonProperty("ROOM_PRICE")
    private Integer roomPrice;

    @Column(name = "CGST")
	@JsonProperty("CGST")
    private Double CGST;

    @Column(name = "IGST")
	@JsonProperty("IGST")
    private Double IGST;

    @Column(name = "SGST")
	@JsonProperty("SGST")
    private Double SGST;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "CREATED_BY")
	@JsonProperty("CREATED_BY")
    private String createdBy;

    
}