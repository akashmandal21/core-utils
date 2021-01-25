package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "BOOKING_ATTRIBUTE")
@Entity
public class BookingAttributeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "BOOKING_ATTRIBUTE_ID", nullable = false)
	@JsonProperty("BOOKING_ATTRIBUTE_ID")
    private Integer bookingAttributeId;

    @Column(name = "ATTRIBUTE_ID")
	@JsonProperty("ATTRIBUTE_ID")
    private Integer attributeId;

    @Column(name = "ATTRIBUTE_NAME")
	@JsonProperty("ATTRIBUTE_NAME")
    private String attributeName;

    @Column(name = "ATTRIBUTE_PRICE")
	@JsonProperty("ATTRIBUTE_PRICE")
    private Integer attributePrice;

    @Column(name = "BOOKING_ID")
	@JsonProperty("BOOKING_ID")
    private Integer bookingId;

    
}