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
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Id
    @Column(insertable = false, name = "REQUEST_UNIQUE_ID", nullable = false)
	@JsonProperty("REQUEST_UNIQUE_ID")
    private String requestUniqueId;

    @Column(name = "TOTAL_DUES")
	@JsonProperty("TOTAL_DUES")
    private Double totalDues = 0D;

    @Column(name = "DUES_PAID")
	@JsonProperty("DUES_PAID")
    private Double duesPaid = 0D;

    @Column(name = "CREATED_AT")
	@JsonProperty("CREATED_AT")
    private Timestamp createdAt;

    
}