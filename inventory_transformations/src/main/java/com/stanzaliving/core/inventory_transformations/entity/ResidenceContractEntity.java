package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "RESIDENCE_CONTRACT")
@IdClass(ResidenceContractEntity.class)
public class ResidenceContractEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "RESIDENCE_ID", insertable = false, nullable = false)
	@JsonProperty("residence_id")
    private Integer residenceId;

    @Id
    @Column(insertable = false, name = "CONTRACT_ID", nullable = false)
	@JsonProperty("contract_id")
    private Integer contractId;

    
}