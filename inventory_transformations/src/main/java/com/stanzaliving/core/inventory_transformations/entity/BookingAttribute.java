package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BOOKING_ATTRIBUTE")
@Data
public class BookingAttribute implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "BOOKING_ATTRIBUTE_ID", nullable = false)
    private Integer bookingAttributeId;

    @Column(name = "ATTRIBUTE_ID")
    private Integer attributeId;

    @Column(name = "ATTRIBUTE_NAME")
    private String attributeName;

    @Column(name = "ATTRIBUTE_PRICE")
    private Integer attributePrice;

    @Column(name = "BOOKING_ID")
    private Integer bookingId;

    
}