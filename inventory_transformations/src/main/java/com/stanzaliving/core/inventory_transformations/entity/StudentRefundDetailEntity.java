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
	@JsonProperty("REFUND_ID")
    private Integer refundId;

    @Column(name = "STUDENT_ID")
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "created_at")
	@JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at", nullable = false)
	@JsonProperty("updated_at")
    private Timestamp updatedAt;

    @Column(name = "REMINDER_COUNT")
	@JsonProperty("REMINDER_COUNT")
    private Integer reminderCount = 0;

    @Column(name = "BOOKING_ID")
	@JsonProperty("BOOKING_ID")
    private Integer bookingId;

    @Column(name = "REFUND_STATUS")
	@JsonProperty("REFUND_STATUS")
    private String refundStatus;

    
}