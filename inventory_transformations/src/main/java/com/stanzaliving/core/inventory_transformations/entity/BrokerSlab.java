package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BROKER_SLAB")
@Data
public class BrokerSlab implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "SLAB_NAME", nullable = false)
    private String slabName;

    @Column(name = "RESTRICTED_VISIBILITY", nullable = false)
    private Boolean restrictedVisibility;

    
}