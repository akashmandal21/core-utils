package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "ROOM_PRICING")
@Data
public class RoomPricingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "ROOM_ID", nullable = false)
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

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED;

    @Column(name = "MANDATORY_SERVICES_PRICE", nullable = false)
	@JsonProperty("MANDATORY_SERVICES_PRICE")
    private Integer mandatoryServicesPrice;

    @Column(name = "ROOM_PRICE", nullable = false)
	@JsonProperty("ROOM_PRICE")
    private Integer roomPrice;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "CGST")
	@JsonProperty("CGST")
    private Double CGST;

    @Column(name = "IGST")
	@JsonProperty("IGST")
    private Double IGST;

    @Column(name = "SGST")
	@JsonProperty("SGST")
    private Double SGST;

    
}