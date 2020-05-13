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
	@JsonProperty("booking_attribute_id")
    private Integer bookingAttributeId;

    @Column(name = "ATTRIBUTE_ID")
	@JsonProperty("attribute_id")
    private Integer attributeId;

    @Column(name = "ATTRIBUTE_NAME")
	@JsonProperty("attribute_name")
    private String attributeName;

    @Column(name = "ATTRIBUTE_PRICE")
	@JsonProperty("attribute_price")
    private Integer attributePrice;

    @Column(name = "BOOKING_ID")
	@JsonProperty("booking_id")
    private Integer bookingId;

    
}