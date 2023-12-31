package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "RESIDENCE_CONTRACT_TYPE")
public class ResidenceContractTypeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESIDENCE_CONTRACT_TYPE_ID", insertable = false, nullable = false)
	@JsonProperty("RESIDENCE_CONTRACT_TYPE_ID")
    private Integer residenceContractTypeId;

    @Column(name = "RESIDENCE_ID", nullable = false)
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "CONTRACT_ID", nullable = false)
	@JsonProperty("CONTRACT_ID")
    private Integer contractId;

    @Column(name = "TYPE", nullable = false)
	@JsonProperty("TYPE")
    private Integer TYPE;

    @Column(name = "IS_ACTIVE", nullable = false, columnDefinition = "tinyint")
	@JsonProperty("IS_ACTIVE")
    private Integer active = 1;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "UDATED", nullable = false)
	@JsonProperty("UDATED")
    private Timestamp UDATED;

    
}