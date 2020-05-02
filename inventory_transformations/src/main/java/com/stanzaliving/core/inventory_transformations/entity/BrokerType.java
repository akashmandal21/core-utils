package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "BROKER_TYPE")
@Entity
@Data
public class BrokerType implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "NAME", nullable = false)
    private String NAME;

    @Column(name = "BROKER_CATEGORY_ID")
    private Integer brokerCategoryId;

    
}