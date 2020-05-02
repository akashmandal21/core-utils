package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "EXT_LEAD_DETAILS")
@Entity
@Data
public class ExtLeadDetails implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "PHONE")
    private String PHONE;

    @Column(name = "CITY_NAME")
    private String cityName;

    @Column(name = "LEAD_SOURCE")
    private String leadSource;

    @Column(name = "HASH")
    private String HASH;

    @Column(name = "LEADATTRIBUTES")
    private String LEADATTRIBUTES;

    @Column(name = "CALLED_NUMBER")
    private String calledNumber;

    
}