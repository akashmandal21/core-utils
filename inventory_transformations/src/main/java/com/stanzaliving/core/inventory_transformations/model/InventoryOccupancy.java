package com.stanzaliving.core.inventory_transformations.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity	
@Table(name = "INVENTORY_OCCUPANCY")
public class InventoryOccupancy {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;

	@Column(name="START_DATE")
	private Date startDate;
	
	@Column(name="END_DATE")
	private Date endDate;

	@Column(name="ROOM_ID")
	private int roomId;
	
	@Column(name="INVENTORY_ID")
	private int inventoryId;
	
	@Column(name="BOOKING_ID")
	private int bookingId;

	@Column(name="RESIDENCE_ID")
	private int residenceId;

	@Column(name="BEDS")
	private double beds;
	
}
