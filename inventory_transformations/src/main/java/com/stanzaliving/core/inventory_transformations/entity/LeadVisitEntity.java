package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "LEAD_VISIT")
public class LeadVisitEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "LEAD_VISIT_ID", nullable = false)
	@JsonProperty("LEAD_VISIT_ID")
    private Integer leadVisitId;

    @Column(name = "VISIT_DATE")
	@JsonProperty("VISIT_DATE")
    private Timestamp visitDate;

    @Column(name = "LEAD_ID")
	@JsonProperty("LEAD_ID")
    private Integer leadId;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "CREATED_AT", nullable = false)
	@JsonProperty("CREATED_AT")
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
	@JsonProperty("UPDATED_AT")
    private Timestamp updatedAt;

    
}