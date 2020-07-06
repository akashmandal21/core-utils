package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "ROOM_ATTRIBUTE")
@Data
@Entity
@IdClass(RoomAttributeEntity.class)
public class RoomAttributeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "ROOM_ID", nullable = false)
	@JsonProperty("ROOM_ID")
    private Integer roomId;

    @Id
    @Column(name = "ATTRIBUTE_ID", insertable = false, nullable = false)
	@JsonProperty("ATTRIBUTE_ID")
    private Integer attributeId;

    
}