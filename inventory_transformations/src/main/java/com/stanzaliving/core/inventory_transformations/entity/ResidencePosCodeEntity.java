package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "RESIDENCE_POS_CODE")
public class ResidencePosCodeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "CREATED_AT", nullable = false)
	@JsonProperty("CREATED_AT")
    private Timestamp createdAt;

    @Column(name = "RESIDENCE_ID", nullable = false)
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "PINE_LAB_POS_CODE", nullable = false)
	@JsonProperty("PINE_LAB_POS_CODE")
    private String pineLabPosCode = "";

    @Column(name = "PINE_LAB_IMEI", nullable = false)
	@JsonProperty("PINE_LAB_IMEI")
    private String pineLabImei = "";

    
}