package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "BLOCKED_ROOM")
@Data
@Entity
public class BlockedRoom implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "ROOM_ID", nullable = false)
    private Integer roomId;

    @Column(name = "BLOCKING_END")
    private LocalDateTime blockingEnd;

    @Column(name = "BLOCKING_REASON")
    private String blockingReason;

    @Column(name = "BLOCKING_START")
    private LocalDateTime blockingStart;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    
}