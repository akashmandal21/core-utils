package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "LEAD_MODE")
@Entity
@Data
public class LeadMode implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LEAD_MODE_ID", insertable = false, nullable = false)
    private Integer leadModeId;

    @Column(name = "LEAD_MODE")
    private String leadMode;

    @Column(name = "LEAD_SUB_MODE")
    private String leadSubMode;

    
}