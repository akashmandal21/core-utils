package com.stanzaliving.core.inventory_transformations.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "ROOM_METADATA")
public class RoomMetadata {
	
	@Id
	@GeneratedValue
	@Column(name = "ROOM_METADATA_ID")
	private int roomMetadataId;
	
	@Column(name = "START_DATE")
	private Date startDate;

	@Column(name = "END_DATE")
	private Date endDate;
	
	@Column(name = "ROOM_ID")
	private int roomId;
	
	@Column(name = "BLOCKED")
	private boolean blocked;
	
	@Column(name= "DEAD")
	private boolean dead;
	
	@Column(name ="OCCUPANCY")
	private int occupancy;
	
	@Column(name = "BED_COUNT")
	private float bedCount;
	 
	public RoomMetadata clone() {
		RoomMetadata newMetadata = new RoomMetadata();
		newMetadata.setBlocked(this.isBlocked());
		newMetadata.setDead(this.isDead());
		newMetadata.setOccupancy(this.getOccupancy());
		newMetadata.setRoomId(this.getRoomId());
		newMetadata.setBedCount(this.getBedCount());
		return newMetadata;
	}
}
