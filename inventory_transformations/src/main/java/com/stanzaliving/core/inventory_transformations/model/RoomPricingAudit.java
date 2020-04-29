package com.stanzaliving.core.inventory_transformations.model;//package com.stanzaliving.inventory.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.MapsId;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import lombok.Data;
//
//@Data
//@Entity
//@Table(name = "ROOM_PRICING_AUDIT")
//public class RoomPricingAudit {
//	
//	@Id
//	@GeneratedValue
//	@Column(name = "ROOM_PRICING_AUDIT_ID")
//	private int roomPricingAuditId;
//
//	@JoinColumn(name="ROOM_ID")
//    @ManyToOne(fetch = FetchType.LAZY)
//    @MapsId
//    private Room room;
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
//	@Column(name="CREATED_BY", nullable=false)
//	private String createdBy ;
//	
//}