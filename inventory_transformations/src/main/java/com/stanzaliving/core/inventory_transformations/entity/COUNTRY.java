package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "COUNTRY")
@Data
public class COUNTRY implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COUNTRY_ID", insertable = false, nullable = false)
    private Integer countryId;

    @Column(name = "NAME")
    private String NAME;

    @Column(name = "CODE")
    private String CODE;

    
}