package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "STUDENT_REFUND_DETAIL")
public class StudentRefundDetailEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "REFUND_ID", nullable = false)
	@JsonProperty("refund_id")
    private Integer refundId;

    @Column(name = "STUDENT_ID")
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "created_at")
	@JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at", nullable = false)
	@JsonProperty("updated_at")
    private Timestamp updatedAt;

    @Column(name = "REMINDER_COUNT")
	@JsonProperty("reminder_count")
    private Integer reminderCount = 0;

    @Column(name = "BOOKING_ID")
	@JsonProperty("booking_id")
    private Integer bookingId;

    @Column(name = "REFUND_STATUS")
	@JsonProperty("refund_status")
    private String refundStatus;

    
}