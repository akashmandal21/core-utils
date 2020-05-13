package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "STUDENT_WIFI")
@Entity
@Data
public class StudentWifiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "STUDENT_ID", nullable = false)
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "CHECKIN_DATE", nullable = false)
	@JsonProperty("CHECKIN_DATE")
    private Timestamp checkinDate;

    @Column(name = "CHECKOUT_DATE")
	@JsonProperty("CHECKOUT_DATE")
    private Timestamp checkoutDate;

    @Column(name = "ENABLED")
	@JsonProperty("ENABLED")
    private Integer ENABLED = 0;

    
}