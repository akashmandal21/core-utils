package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BROKER_SLAB_DETAILS")
@Data
public class BrokerSlabDetails implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "AMOUNT_PER_LEADS", nullable = false)
    private Integer amountPerLeads;

    @Column(name = "MAX_LEADS", nullable = false)
    private Integer maxLeads;

    @Column(name = "MIN_LEADS", nullable = false)
    private Integer minLeads;

    @Column(name = "BROKER_SLAB_ID")
    private Integer brokerSlabId;

    
}