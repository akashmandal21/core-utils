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
	@JsonProperty("lead_visit_id")
    private Integer leadVisitId;

    @Column(name = "VISIT_DATE")
	@JsonProperty("visit_date")
    private Timestamp visitDate;

    @Column(name = "LEAD_ID")
	@JsonProperty("lead_id")
    private Integer leadId;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("residence_id")
    private Integer residenceId;

    @Column(name = "CREATED_AT", nullable = false)
	@JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
	@JsonProperty("updated_at")
    private Timestamp updatedAt;

    
}