package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "IMAGE")
@Data
public class IMAGEEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IMAGE_ID", insertable = false, nullable = false)
	@JsonProperty("IMAGE_ID")
    private Integer imageId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "ENABLED")
	@JsonProperty("ENABLED")
    private Boolean ENABLED;

    @Column(name = "IMAGE_URL")
	@JsonProperty("IMAGE_URL")
    private String imageUrl;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "ROOM_ID")
	@JsonProperty("ROOM_ID")
    private Integer roomId;

    @Column(name = "IMAGE_TYPE_ID")
	@JsonProperty("IMAGE_TYPE_ID")
    private Integer imageTypeId;

    
}