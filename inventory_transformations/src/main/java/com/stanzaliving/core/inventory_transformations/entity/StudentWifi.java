package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "STUDENT_WIFI")
@Entity
@Data
public class StudentWifi implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "STUDENT_ID", nullable = false)
    private String studentId;

    @Column(name = "CHECKIN_DATE", nullable = false)
    private LocalDateTime checkinDate;

    @Column(name = "CHECKOUT_DATE")
    private LocalDateTime checkoutDate;

    @Column(name = "ENABLED")
    private Integer ENABLED = 0;

    
}