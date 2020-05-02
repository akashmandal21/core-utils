package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "ROOM_CHANGE_DUES")
public class RoomChangeDues implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Id
    @Column(insertable = false, name = "REQUEST_UNIQUE_ID", nullable = false)
    private String requestUniqueId;

    @Column(name = "TOTAL_DUES")
    private Double totalDues = 0D;

    @Column(name = "DUES_PAID")
    private Double duesPaid = 0D;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    
}