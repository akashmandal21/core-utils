package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "USER")
public class USER implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "USERNAME", insertable = false, nullable = false)
    private String USERNAME;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "EMAIL")
    private String EMAIL;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "LEVEL")
    private String LEVEL;

    @Column(name = "NAME")
    private String NAME;

    @Column(name = "PASSWORD", nullable = false)
    private String PASSWORD;

    @Column(name = "PHONE")
    private Long PHONE;

    @Column(name = "TEAM")
    private String TEAM;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "CITY_ID")
    private Integer cityId;

    @Column(name = "MICROMARKET_ID")
    private Integer micromarketId;

    
}