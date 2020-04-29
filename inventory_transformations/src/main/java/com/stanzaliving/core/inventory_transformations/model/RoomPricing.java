package com.stanzaliving.core.inventory_transformations.model;//package com.stanzaliving.inventory.model;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.MapsId;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "ROOM_PRICING")
//public class RoomPricing {
//	
//	@Id
//    private int id;
// 
//	@JoinColumn(name="ROOM_ID")
//    @OneToOne(fetch = FetchType.LAZY)
//    @MapsId
//    private Room room;
//	
//	@Override
//	public String toString() {
//		return " [roomId=" + id  + "\n" +  " bufferPrice=" + bufferPrice + "]";
//	}
//
//	@Column(name="BASE_PRICE",nullable=false)
//	private int basePrice;
//	
//	@Column(name="MANDATORY_SERVICES_PRICE",nullable=false)
//	private double mandatoryServicesPrice;
//	
//	@Column(name="ATTRIBUTES_PRICE",nullable=true)
//	private int attributesPrice;
//	
//	@Column(name="BUFFER_PRICE",nullable=false)
//	private int bufferPrice;
//	
//	@Column(name="ROOM_PRICE",nullable=false)
//	private int roomPrice;
//	
//	@Column(name="CGST")
//	private double cgst;
//	
//	@Column(name="SGST")
//	private double sgst;
//	
//	@Column(name="IGST")
//	private double igst;
//	
//	@Column(name="CREATED", nullable=false)
//	private Date created = new Date();
//	
//	@Column(name="UPDATED", nullable=false)
//	private Date updated = new Date();
//	
//	@Column(name="ENABLED", nullable=false)
//	private boolean enabled = true;
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public Room getRoom() {
//		return room;
//	}
//
//	public void setRoom(Room room) {
//		this.room = room;
//	}
//
//	public int getBasePrice() {
//		return basePrice;
//	}
//
//	public void setBasePrice(int basePrice) {
//		this.basePrice = basePrice;
//	}
//
//	public double getMandatoryServicesPrice() {
//		return mandatoryServicesPrice;
//	}
//
//	public void setMandatoryServicesPrice(double mandatoryServicesPrice) {
//		this.mandatoryServicesPrice = mandatoryServicesPrice;
//	}
//
//	public int getAttributesPrice() {
//		return attributesPrice;
//	}
//
//	public void setAttributesPrice(int attributesPrice) {
//		this.attributesPrice = attributesPrice;
//	}
//
//	public int getBufferPrice() {
//		return bufferPrice;
//	}
//
//	public void setBufferPrice(int bufferPrice) {
//		this.bufferPrice = bufferPrice;
//	}
//	
//	public int getRoomPrice() {
//		return roomPrice;
//	}
//
//	public void setRoomPrice(int roomPrice) {
//		this.roomPrice = roomPrice;
//	}
//
//	public Date getCreated() {
//		return created;
//	}
//
//	public void setCreated(Date created) {
//		this.created = created;
//	}
//
//	public Date getUpdated() {
//		return updated;
//	}
//
//	public void setUpdated(Date updated) {
//		this.updated = updated;
//	}
//
//	public boolean isEnabled() {
//		return enabled;
//	}
//
//	public void setEnabled(boolean enabled) {
//		this.enabled = enabled;
//	}
//
//	public double getCgst() {
//		return cgst;
//	}
//
//	public void setCgst(double cgst) {
//		this.cgst = cgst;
//	}
//
//	public double getSgst() {
//		return sgst;
//	}
//
//	public void setSgst(double sgst) {
//		this.sgst = sgst;
//	}
//
//	public double getIgst() {
//		return igst;
//	}
//
//	public void setIgst(double igst) {
//		this.igst = igst;
//	}
//
//}
