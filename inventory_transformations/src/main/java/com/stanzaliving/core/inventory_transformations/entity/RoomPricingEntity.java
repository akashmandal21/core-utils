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

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("enabled")
    private Boolean ENABLED;

    @Column(name = "MANDATORY_SERVICES_PRICE", nullable = false)
	@JsonProperty("mandatory_services_price")
    private Integer mandatoryServicesPrice;

    @Column(name = "ROOM_PRICE", nullable = false)
	@JsonProperty("room_price")
    private Integer roomPrice;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "CGST")
	@JsonProperty("cgst")
    private Double CGST;

    @Column(name = "IGST")
	@JsonProperty("igst")
    private Double IGST;

    @Column(name = "SGST")
	@JsonProperty("sgst")
    private Double SGST;

    
}