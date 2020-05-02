package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "OPS_RESIDENCE_MAPPING")
@Data
public class OpsResidenceMapping implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "VENTA_RESIDENCE_ID")
    private Integer ventaResidenceId;

    @Column(name = "OPS_RESIDENCE_ID")
    private String opsResidenceId;

    @Column(name = "NAME")
    private String NAME;

    
}