package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "LEAD_VISIT")
@Data
public class LeadVisit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "LEAD_VISIT_ID", nullable = false)
    private Integer leadVisitId;

    @Column(name = "VISIT_DATE")
    private LocalDateTime visitDate;

    @Column(name = "LEAD_ID")
    private Integer leadId;

    @Column(name = "RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAt;

    
}