package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "RESIDENCE_ANCILLARY_SERVICES")
public class ResidenceAncillaryServices implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "RESIDENCE_ID", insertable = false, nullable = false)
    private Integer residenceId;

    @Id
    @Column(name = "ANCILLARY_SERVICES_ID", insertable = false, nullable = false)
    private Integer ancillaryServicesId;

    
}