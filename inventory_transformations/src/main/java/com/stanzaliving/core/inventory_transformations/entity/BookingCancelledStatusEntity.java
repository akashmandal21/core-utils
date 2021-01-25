package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "BOOKING_CANCELLED_STATUS")
@Data
public class BookingCancelledStatusEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOKING_CANCELLED_STATUS_ID", insertable = false, nullable = false)
	@JsonProperty("BOOKING_CANCELLED_STATUS_ID")
    private Integer bookingCancelledStatusId;

    @Column(name = "BOOKING_ID", nullable = false)
	@JsonProperty("BOOKING_ID")
    private Integer bookingId;

    @Column(name = "BOOKING_SUB_STATUS")
	@JsonProperty("BOOKING_SUB_STATUS")
    private String bookingSubStatus;

    @Column(name = "COMMENTS")
	@JsonProperty("COMMENTS")
    private String COMMENTS;

    @Column(name = "CANCELLED_DATE")
	@JsonProperty("CANCELLED_DATE")
    private Timestamp cancelledDate;

    @Column(name = "CREATED_BY")
	@JsonProperty("CREATED_BY")
    private String createdBy;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "UPDATED")
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    
}