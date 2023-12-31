package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Table(name = "BLOCKED_ROOM")
@Entity
public class BlockedRoomEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "ROOM_ID", nullable = false)
	@JsonProperty("ROOM_ID")
    private Integer roomId;

    @Column(name = "BLOCKING_END")
	@JsonProperty("BLOCKING_END")
    private Timestamp blockingEnd;

    @Column(name = "BLOCKING_REASON")
	@JsonProperty("BLOCKING_REASON")
    private String blockingReason;

    @Column(name = "BLOCKING_START")
	@JsonProperty("BLOCKING_START")
    private Timestamp blockingStart;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    
}