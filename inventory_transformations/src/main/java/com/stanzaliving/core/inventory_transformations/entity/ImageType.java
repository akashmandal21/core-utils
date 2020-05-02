package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "IMAGE_TYPE")
public class ImageType implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IMAGE_TYPE_ID", insertable = false, nullable = false)
    private Integer imageTypeId;

    @Column(name = "IMAGE_TYPE_NAME")
    private String imageTypeName;

    
}