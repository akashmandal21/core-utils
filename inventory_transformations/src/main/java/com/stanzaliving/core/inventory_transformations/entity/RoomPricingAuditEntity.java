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
	@JsonProperty("room_pricing_audit_id")
    private Integer roomPricingAuditId;

    @Column(name = "ROOM_ID", nullable = false)
	@JsonProperty("room_id")
    private Integer roomId;

    @Column(name = "ATTRIBUTES_PRICE")
	@JsonProperty("attributes_price")
    private Integer attributesPrice;

    @Column(name = "BASE_PRICE", nullable = false)
	@JsonProperty("base_price")
    private Integer basePrice;

    @Column(name = "BUFFER_PRICE", nullable = false)
	@JsonProperty("buffer_price")
    private Integer bufferPrice;

    @Column(name = "MANDATORY_SERVICES_PRICE", nullable = false)
	@JsonProperty("mandatory_services_price")
    private Integer mandatoryServicesPrice;

    @Column(name = "ROOM_PRICE", nullable = false)
	@JsonProperty("room_price")
    private Integer roomPrice;

    @Column(name = "CGST")
	@JsonProperty("cgst")
    private Double CGST;

    @Column(name = "IGST")
	@JsonProperty("igst")
    private Double IGST;

    @Column(name = "SGST")
	@JsonProperty("sgst")
    private Double SGST;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "CREATED_BY")
	@JsonProperty("created_by")
    private String createdBy;

    
}