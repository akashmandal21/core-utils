package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "BOOKING_CANCELLED_STATUS")
@Data
public class BookingCancelledStatus implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOKING_CANCELLED_STATUS_ID", insertable = false, nullable = false)
    private Integer bookingCancelledStatusId;

    @Column(name = "BOOKING_ID", nullable = false)
    private Integer bookingId;

    @Column(name = "BOOKING_SUB_STATUS")
    private String bookingSubStatus;

    @Column(name = "COMMENTS")
    private String COMMENTS;

    @Column(name = "CANCELLED_DATE")
    private LocalDateTime cancelledDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "UPDATED")
    private LocalDateTime UPDATED;

    
}