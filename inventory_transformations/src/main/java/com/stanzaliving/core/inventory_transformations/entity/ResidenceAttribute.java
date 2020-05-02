package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "RESIDENCE_ATTRIBUTE")
@Data
@Entity
public class ResidenceAttribute implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "RESIDENCE_ATTRIBUTE_ID", nullable = false)
    private Integer residenceAttributeId;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED;

    @Column(name = "PRICE", nullable = false)
    private Integer PRICE;

    @Column(name = "PRICE_TYPE", nullable = false)
    private Integer priceType;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "ATTRIBUTE_ID")
    private Integer attributeId;

    @Column(name = "RESIDENCE_ID")
    private Integer residenceId;

    
}