package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Table(name = "CITY_POLICE_VERIFICATION")
@Entity
public class CityPoliceVerification implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "CITY_ID", nullable = false)
    private Integer cityId;

    @Column(name = "CREATED")
    private LocalDateTime CREATED;

    @Column(name = "FORM_URL")
    private String formUrl;

    @Column(name = "UPDATED")
    private LocalDateTime UPDATED;

    
}