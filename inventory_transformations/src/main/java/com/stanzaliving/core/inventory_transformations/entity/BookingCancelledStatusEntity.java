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
	@JsonProperty("booking_cancelled_status_id")
    private Integer bookingCancelledStatusId;

    @Column(name = "BOOKING_ID", nullable = false)
	@JsonProperty("booking_id")
    private Integer bookingId;

    @Column(name = "BOOKING_SUB_STATUS")
	@JsonProperty("booking_sub_status")
    private String bookingSubStatus;

    @Column(name = "COMMENTS")
	@JsonProperty("comments")
    private String COMMENTS;

    @Column(name = "CANCELLED_DATE")
	@JsonProperty("cancelled_date")
    private Timestamp cancelledDate;

    @Column(name = "CREATED_BY")
	@JsonProperty("created_by")
    private String createdBy;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("enabled")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "UPDATED")
	@JsonProperty("updated")
    private Timestamp UPDATED;

    
}