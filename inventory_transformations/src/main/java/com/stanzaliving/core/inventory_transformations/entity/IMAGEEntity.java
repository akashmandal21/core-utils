package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "IMAGE")
@Data
public class ImageEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IMAGE_ID", insertable = false, nullable = false)
	@JsonProperty("image_id")
    private Integer imageId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "ENABLED")
	@JsonProperty("enabled")
    private Boolean ENABLED;

    @Column(name = "IMAGE_URL")
	@JsonProperty("image_url")
    private String imageUrl;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "ROOM_ID")
	@JsonProperty("room_id")
    private Integer roomId;

    @Column(name = "IMAGE_TYPE_ID")
	@JsonProperty("image_type_id")
    private Integer imageTypeId;

    
}