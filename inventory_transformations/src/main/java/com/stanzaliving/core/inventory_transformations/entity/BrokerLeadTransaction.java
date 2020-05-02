package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "BROKER_LEAD_TRANSACTION")
@Data
@Entity
public class BrokerLeadTransaction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "BROKER_ID")
    private Integer brokerId;

    @Column(name = "LEAD_ID")
    private Integer leadId;

    @Column(name = "SLAB_ID")
    private Integer slabId;

    @Column(name = "COMMISSION", nullable = false)
    private Integer COMMISSION;

    @Column(name = "COMMISSION_PROCESSED")
    private Boolean commissionProcessed = Boolean.FALSE;

    
}