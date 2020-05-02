package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "INSTITUTION_DOCUMENT")
public class InstitutionDocument implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "IMG_URL", nullable = false)
    private String imgUrl;

    @Column(name = "TYPE", nullable = false)
    private String TYPE;

    @Column(name = "INSTITUTION_ID")
    private Integer institutionId;

    
}