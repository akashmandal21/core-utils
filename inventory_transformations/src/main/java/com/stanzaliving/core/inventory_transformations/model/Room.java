package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ROOM")
public class Room {

	@Id()
	@GeneratedValue
	@Column(name = "ROOM_ID")
	private int roomId;

	@Column(name = "ROOM_NUMBER", nullable = false, unique = true)
	private String roomNumber;

	@Column(name = "FLOOR", nullable = false)
	private String floor;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RESIDENCE_ID")
	private Residence residence;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ROOM_OCCUPANCY_ID")
	private Occupancy occupancy;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ROOM_INITIAL_OCCUPANCY_ID")
	private Occupancy initialOccupancy;

	@Column(name = "DEAD")
	private boolean dead;

	@Column(name = "CONVERTIBLE")
	private boolean convertible;
	
	@Column(name = "BLOCKED")
	private boolean blocked;
	
	@Column(name = "BED_COUNT")
	private BigDecimal bedCount;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "ROOM_ATTRIBUTE", joinColumns = { @JoinColumn(name = "ROOM_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "ATTRIBUTE_ID") })
	private Set<Attribute> attributes = new HashSet<>(0);

	@OneToMany(mappedBy = "room", cascade = { CascadeType.ALL }, orphanRemoval = true, fetch = FetchType.EAGER)
	private Set<Image> images = new HashSet<>(0);
	
	@OneToMany(mappedBy = "room", cascade = { CascadeType.ALL }, orphanRemoval = true, fetch = FetchType.EAGER)
	private Set<Inventory> inventories = new HashSet<>(0);
	
//	@OneToOne(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER, optional=true)
//	private RoomPricing roomPricing;

	@Column(name = "CREATED", nullable = false)
	private Date created = new Date();

	@Column(name = "UPDATED", nullable = false)
	private Date updated = new Date();

	@Column(name = "ENABLED", nullable = false)
	private boolean enabled = true;

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getFloor() {
		return floor;
	}

	public Set<Inventory> getInventories() {
		return inventories;
	}

	public void setInventories(Set<Inventory> inventories) {
		this.inventories.clear();
		this.getInventories().addAll(inventories);
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public Residence getResidence() {
		return residence;
	}

	public void setResidence(Residence residence) {
		this.residence = residence;
	}

	public Occupancy getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(Occupancy occupancy) {
		this.occupancy = occupancy;
	}

	public Occupancy getInitialOccupancy() {
		return initialOccupancy;
	}

	public void setInitialOccupancy(Occupancy initialOccupancy) {
		this.initialOccupancy = initialOccupancy;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public BigDecimal getBedCount() {
		return bedCount;
	}

	public void setBedCount(BigDecimal bedCount) {
		this.bedCount = bedCount;
	}

	public boolean isDead() {
		return dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}

	public boolean isConvertible() {
		return convertible;
	}

//	public RoomPricing getRoomPricing() {
//		return roomPricing;
//	}
//
//	public void setRoomPricing(RoomPricing roomPricing) {
//		this.roomPricing = roomPricing;
//	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}

	public Set<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<Attribute> attributes) {
		this.attributes = attributes;
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

	public Set<Image> getImages() {
		return images;
	}

	public void setImages(Set<Image> images) {
		this.images = images;
	}

}
