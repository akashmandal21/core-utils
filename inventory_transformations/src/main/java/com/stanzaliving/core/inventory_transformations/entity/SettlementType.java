package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "SETTLEMENT_TYPE")
@Data
@Entity
public class SettlementType implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SETTLEMENT_TYPE_ID", insertable = false, nullable = false)
    private Integer settlementTypeId;

    @Column(name = "SETTLEMENT_TYPE_NAME", nullable = false)
    private String settlementTypeName;

    @Column(name = "DISPLAY_NAME", nullable = false)
    private String displayName = "";

    
}