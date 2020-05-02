package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "STUDENT_REFUND_DETAIL")
public class StudentRefundDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "REFUND_ID", nullable = false)
    private Integer refundId;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "REMINDER_COUNT")
    private Integer reminderCount = 0;

    @Column(name = "BOOKING_ID")
    private Integer bookingId;

    @Column(name = "REFUND_STATUS")
    private String refundStatus;

    
}