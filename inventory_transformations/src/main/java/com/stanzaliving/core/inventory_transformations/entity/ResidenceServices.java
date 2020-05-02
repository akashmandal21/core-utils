package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "RESIDENCE_SERVICES")
public class ResidenceServices implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "RESIDENCE_SERVICE_ID", nullable = false)
    private Integer residenceServiceId;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED;

    @Column(name = "OPTIONAL", nullable = false)
    private Boolean OPTIONAL;

    @Column(name = "PRICE", nullable = false)
    private Double PRICE;

    @Column(name = "PRICE_TYPE", nullable = false)
    private Integer priceType;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "SERVICE_ID")
    private Integer serviceId;

    
}