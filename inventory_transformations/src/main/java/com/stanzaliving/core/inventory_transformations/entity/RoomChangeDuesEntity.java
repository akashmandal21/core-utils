package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "ROOM_CHANGE_DUES")
public class RoomChangeDuesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "STUDENT_ID")
	@JsonProperty("student_id")
    private String studentId;

    @Id
    @Column(insertable = false, name = "REQUEST_UNIQUE_ID", nullable = false)
	@JsonProperty("request_unique_id")
    private String requestUniqueId;

    @Column(name = "TOTAL_DUES")
	@JsonProperty("total_dues")
    private Double totalDues = 0D;

    @Column(name = "DUES_PAID")
	@JsonProperty("dues_paid")
    private Double duesPaid = 0D;

    @Column(name = "CREATED_AT")
	@JsonProperty("created_at")
    private Timestamp createdAt;

    
}