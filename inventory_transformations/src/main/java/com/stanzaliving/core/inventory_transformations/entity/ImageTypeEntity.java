package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "IMAGE_TYPE")
@Data
@Entity
public class ImageTypeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IMAGE_TYPE_ID", insertable = false, nullable = false)
	@JsonProperty("IMAGE_TYPE_ID")
    private Integer imageTypeId;

    @Column(name = "IMAGE_TYPE_NAME")
	@JsonProperty("IMAGE_TYPE_NAME")
    private String imageTypeName;

    
}