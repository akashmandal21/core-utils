package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BLOCKED_ROOM")
public class BlockedRoom {
	
	@Id
    private int id;
 
    @Column(name = "BLOCKING_REASON")
    private String blockingReason;
 
    @JoinColumn(name="ROOM_ID")
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Room room;
 
	@Column(name="BLOCKING_START")
	private Date blockingStart;

	@Column(name="BLOCKING_END")
	private Date blockingEnd;
	
	@Column(name="CREATED", nullable=false)
	private Date created = new Date();
	
	@Column(name="UPDATED", nullable=false)
	private Date updated = new Date();
	
	@Column(name="ENABLED", nullable=false)
	private boolean enabled = true;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBlockingReason() {
		return blockingReason;
	}

	public void setBlockingReason(String blockingReason) {
		this.blockingReason = blockingReason;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Date getBlockingStart() {
		return blockingStart;
	}

	public void setBlockingStart(Date blockingStart) {
		this.blockingStart = blockingStart;
	}

	public Date getBlockingEnd() {
		return blockingEnd;
	}

	public void setBlockingEnd(Date blockingEnd) {
		this.blockingEnd = blockingEnd;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
}
