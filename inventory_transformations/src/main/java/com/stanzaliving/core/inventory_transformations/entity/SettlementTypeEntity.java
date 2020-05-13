package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "SETTLEMENT_TYPE")
public class SettlementTypeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SETTLEMENT_TYPE_ID", insertable = false, nullable = false)
	@JsonProperty("settlement_type_id")
    private Integer settlementTypeId;

    @Column(name = "SETTLEMENT_TYPE_NAME", nullable = false)
	@JsonProperty("settlement_type_name")
    private String settlementTypeName;

    @Column(name = "DISPLAY_NAME", nullable = false)
	@JsonProperty("display_name")
    private String displayName = "";

    
}