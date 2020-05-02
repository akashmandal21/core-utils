package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "CITY")
@Data
@Entity
public class CITY implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "CITY_ID", nullable = false)
    private Integer cityId;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "LATITUDE")
    private Double LATITUDE;

    @Column(name = "LONGITUDE")
    private Double LONGITUDE;

    @Column(name = "NAME", nullable = false)
    private String NAME;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "STATE_ID")
    @JsonProperty("STATE_ID")
    private Integer stateId;

    @Column(name = "CODE")
    private String CODE;

    @JsonProperty("BROKER_APP_VISIBLE")
    @Column(name = "BROKER_APP_VISIBLE", nullable = false)
    private Boolean brokerAppVisible;

    
}