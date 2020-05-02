package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "IMAGE")
public class IMAGE implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IMAGE_ID", insertable = false, nullable = false)
    private Integer imageId;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "ENABLED")
    private Boolean ENABLED;

    @Column(name = "IMAGE_URL")
    private String imageUrl;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "ROOM_ID")
    private Integer roomId;

    @Column(name = "IMAGE_TYPE_ID")
    private Integer imageTypeId;

    
}