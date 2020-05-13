package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BOOKING_ATTRIBUTE_AUDIT")
@Data
public class BookingAttributeAuditEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "BOOKING_ATTRIBUTE_AUDIT_ID", nullable = false)
	@JsonProperty("booking_attribute_audit_id")
    private Integer bookingAttributeAuditId;

    @Column(name = "ATTRIBUTE_ID")
	@JsonProperty("attribute_id")
    private Integer attributeId;

    @Column(name = "ATTRIBUTE_NAME")
	@JsonProperty("attribute_name")
    private String attributeName;

    @Column(name = "ATTRIBUTE_PRICE")
	@JsonProperty("attribute_price")
    private Integer attributePrice;

    @Column(name = "BOOKING_AUDIT_ID")
	@JsonProperty("booking_audit_id")
    private Integer bookingAuditId;

    
}