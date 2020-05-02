package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "OPS_MICROMARKET_MAPPING")
@Entity
public class OpsMicromarketMapping implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "VENTA_MICROMARKET_ID")
    private Integer ventaMicromarketId;

    @Column(name = "OPS_MICROMARKET_ID")
    private String opsMicromarketId;

    @Column(name = "NAME")
    private String NAME;

    
}