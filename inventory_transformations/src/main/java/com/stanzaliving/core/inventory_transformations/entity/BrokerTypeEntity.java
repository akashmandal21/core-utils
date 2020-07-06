package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BROKER_TYPE")
@Data
public class BrokerTypeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "NAME", nullable = false)
	@JsonProperty("NAME")
    private String NAME;

    @Column(name = "BROKER_CATEGORY_ID")
	@JsonProperty("BROKER_CATEGORY_ID")
    private Integer brokerCategoryId;

    
}