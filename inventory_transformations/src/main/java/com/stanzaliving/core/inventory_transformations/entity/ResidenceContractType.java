package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "RESIDENCE_CONTRACT_TYPE")
@Data
@Entity
public class ResidenceContractType implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESIDENCE_CONTRACT_TYPE_ID", insertable = false, nullable = false)
    private Integer residenceContractTypeId;

    @Column(name = "RESIDENCE_ID", nullable = false)
    private Integer residenceId;

    @Column(name = "CONTRACT_ID", nullable = false)
    private Integer contractId;

    @Column(name = "TYPE", nullable = false)
    private Integer TYPE;

    @Column(name = "IS_ACTIVE", nullable = false)
    private Integer active = 1;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "UDATED", nullable = false)
    private LocalDateTime UDATED;

    
}