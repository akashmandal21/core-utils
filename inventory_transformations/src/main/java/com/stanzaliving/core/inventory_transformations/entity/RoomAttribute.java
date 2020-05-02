package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "ROOM_ATTRIBUTE")
@Data
@Entity
public class RoomAttribute implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "ROOM_ID", nullable = false)
    private Integer roomId;

    @Id
    @Column(name = "ATTRIBUTE_ID", insertable = false, nullable = false)
    private Integer attributeId;

    
}