package com.stanzaliving.core.inventory_transformations.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity	
@Table(name = "INVENTORY_PRICING")
public class InventoryPricing {

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

	@Column(name="RESIDENCE_ID")
	private int residenceId;
	
	@Column(name="BASE_PRICE",nullable=false)
	private int basePrice;
	
	@Column(name="MANDATORY_SERVICES_PRICE",nullable=false)
	private double mandatoryServicesPrice;
	
	@Column(name="ATTRIBUTES_PRICE",nullable=true)
	private int attributesPrice;
	
	@Column(name="BUFFER_PRICE",nullable=false)
	private int bufferPrice;
	
	@Column(name="ROOM_PRICE",nullable=false)
	private int roomPrice;
	
	@Column(name="CGST")
	private double cgst;
	
	@Column(name="SGST")
	private double sgst;
	
	@Column(name="IGST")
	private double igst;

	@Column(name = "STUDENT_REFUNDABLE_SECURITY_DEPOSIT", nullable = true)
	private int studentRefundableSecurityDeposit;

	@Column(name = "STUDENT_NON_REFUNDABLE_SECURITY_DEPOSIT", nullable = true)
	private int studentNonRefundableSecurityDeposit;

	@Column(name = "STUDENT_ADMIN_CHARGES", nullable = true)
	private int studentAdminCharges;
	
	@Column(name = "STUDENT_RETENTION_BOOKING_AMOUNT")
	private double studentRetentionBookingAmount;
	
	@Column(name = "STUDENT_ADVANCE_RENTAL")
	private int studentAdvanceRental = 3;
	
	@Column(name = "STUDENT_PENALTY_AMOUNT")
	private double studentPenaltyAmount;
	
	@Column(name = "STUDENT_MAINTENANCE_FEE")
	private double studentMaintainanceFee ;
	
	@Column(name = "WP_REFUNDABLE_SECURITY_DEPOSIT", nullable = true)
	private int wpRefundableSecurityDeposit;

	@Column(name = "WP_NON_REFUNDABLE_SECURITY_DEPOSIT", nullable = true)
	private int wpNonRefundableSecurityDeposit;

	@Column(name = "WP_ADMIN_CHARGES", nullable = true)
	private int wpAdminCharges;
	
	@Column(name = "WP_RETENTION_BOOKING_AMOUNT")
	private double wpRetentionBookingAmount;
	
	@Column(name = "WP_ADVANCE_RENTAL")
	private int wpAdvanceRental = 3;
	
	@Column(name = "WP_PENALTY_AMOUNT")
	private double wpPenaltyAmount;
	
	@Column(name = "WP_MAINTENANCE_FEE")
	private double wpMaintainanceFee ;
	
	@Column(name = "VARIABLE_SECURITY_DEPOSIT")
	private Double variableSecurityDeposit;
	
	@Column(name = "NUMBER_OF_BEDS")
	private float numberOfbeds;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ROOM_METADATA")
	private RoomMetadata roomMetadata;

	@Column(name = "PRORATED_MAINTENANCE_FEE")
	private Double proratedMaintainanceFee;

	public InventoryPricing clone(){ 
		InventoryPricing ip = new InventoryPricing();
		ip.setAttributesPrice(this.getAttributesPrice());
		ip.setBasePrice(this.getBasePrice());
		ip.setBufferPrice(this.getBufferPrice());
		ip.setCgst(this.getCgst());
		ip.setEndDate(this.getEndDate());
		ip.setIgst(this.getIgst());
		ip.setInventoryId(this.getInventoryId());
		ip.setMandatoryServicesPrice(this.getMandatoryServicesPrice());
		ip.setResidenceId(this.getResidenceId());
		ip.setRoomId(this.getRoomId());
		ip.setRoomPrice(this.getRoomPrice());
		ip.setSgst(this.getSgst());
		ip.setStartDate(this.getStartDate());
		ip.setStudentAdminCharges(this.getStudentAdminCharges());
		ip.setStudentAdvanceRental(this.getStudentAdvanceRental());
		ip.setStudentMaintainanceFee(this.getStudentMaintainanceFee());
		ip.setStudentNonRefundableSecurityDeposit(this.getStudentNonRefundableSecurityDeposit());
		ip.setStudentPenaltyAmount(this.getStudentPenaltyAmount());
		ip.setStudentRefundableSecurityDeposit(this.getStudentRefundableSecurityDeposit());
		ip.setStudentRetentionBookingAmount(this.getStudentRetentionBookingAmount());
		ip.setWpAdminCharges(this.getWpAdminCharges());
		ip.setWpAdvanceRental(this.getWpAdvanceRental());
		ip.setWpMaintainanceFee(this.getWpMaintainanceFee());
		ip.setWpNonRefundableSecurityDeposit(this.getWpNonRefundableSecurityDeposit());
		ip.setWpPenaltyAmount(this.getWpPenaltyAmount());
		ip.setWpRefundableSecurityDeposit(this.getWpRefundableSecurityDeposit());
		ip.setWpRetentionBookingAmount(this.getWpRetentionBookingAmount());
		ip.setProratedMaintainanceFee(this.proratedMaintainanceFee);
		ip.setRoomMetadata(this.getRoomMetadata());
		ip.setNumberOfbeds(this.getNumberOfbeds());
		return ip;  
	}
}
