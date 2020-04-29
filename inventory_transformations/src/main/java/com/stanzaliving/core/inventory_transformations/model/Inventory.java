package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "INVENTORY")
public class Inventory {
	
	@Id
	@GeneratedValue
	@Column(name="INVENTORY_ID")
	private int inventoryId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ROOM_ID")
	private Room room;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="RESIDENCE_ID")
	private Residence residence;

	@Column(name="OCCUPIED")
	private boolean occupied;
	
	@Column(name="NUMBER_OF_BEDS")
	private float numberOfBeds;
	
//	@OneToOne(mappedBy = "inventory",fetch = FetchType.LAZY, optional=true)
//	private Student student;
	
	@OneToOne(mappedBy = "inventory", fetch = FetchType.LAZY, optional=true)
	private TemporaryStudent temporaryStudent;
	
	@Column(name="CREATED", nullable=false)
	private Date created = new Date();
	
	@Column(name="UPDATED", nullable=false)
	private Date updated = new Date();
	
	@Column(name="ENABLED", nullable=false)
	private boolean enabled = true;

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

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Residence getResidence() {
		return residence;
	}

	public void setResidence(Residence residence) {
		this.residence = residence;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public float getNumberOfBeds() {
		return numberOfBeds;
	}

	public void setNumberOfBeds(float numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}

//	public Student getStudent() {
//		return student;
//	}
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}
//
	public TemporaryStudent getTemporaryStudent() {
		return temporaryStudent;
	}

	public void setTemporaryStudent(TemporaryStudent temporaryStudent) {
		this.temporaryStudent = temporaryStudent;
	}

}
