package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Table(name = "RESIDENCE_RC")
@Entity
public class ResidenceRcEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "RESIDENCE_RC_ID", nullable = false)
	@JsonProperty("residence_rc_id")
    private Integer residenceRcId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("enabled")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "NAME", nullable = false)
	@JsonProperty("name")
    private String NAME;

    @Column(name = "PAYMONK_SENDER_ID", nullable = false)
	@JsonProperty("paymonk_sender_id")
    private String paymonkSenderId;

    @Column(name = "PHONE", nullable = false)
	@JsonProperty("phone")
    private String PHONE;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    
}