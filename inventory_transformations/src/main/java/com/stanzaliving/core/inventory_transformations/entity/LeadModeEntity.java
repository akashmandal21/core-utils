package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "LEAD_MODE")
public class LeadModeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LEAD_MODE_ID", insertable = false, nullable = false)
	@JsonProperty("LEAD_MODE_ID")
    private Integer leadModeId;

    @Column(name = "LEAD_MODE")
	@JsonProperty("LEAD_MODE")
    private String leadMode;

    @Column(name = "LEAD_SUB_MODE")
	@JsonProperty("LEAD_SUB_MODE")
    private String leadSubMode;

    
}