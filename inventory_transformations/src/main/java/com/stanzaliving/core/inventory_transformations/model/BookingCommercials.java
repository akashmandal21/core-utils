package com.stanzaliving.core.inventory_transformations.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "BOOKING_COMMERCIALS")
public class BookingCommercials {

	@Id
	private int Id;

	@JoinColumn(name = "BOOKING_ID")
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private Booking booking;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	@JoinColumn(name = "DISCOUNT_ID")
	private Discount discount;

	@Column(name = "ROOM_PRICE")
	private double roomPrice;

	@Column(name = "MANDATORY_SERVICE_PRICE")
	private double mandatoryServicePrice;

	@Column(name = "OPTIONAL_SERVICE_PRICE")
	private double optionalServicePrice;
	
	@Column(name = "VAS_PRICE")
	private double vasPrice;

	@Column(name = "BUFFER_PRICE")
	private double bufferPrice;

	@Column(name = "CGST")
	private double cgst;

	@Column(name = "SGST")
	private double sgst;

	@Column(name = "IGST")
	private double igst;

	@Column(name = "REFUNDABLE_SECURITY")
	private double refundableSecurity;

	@Column(name = "NON_REFUNDABLE_SECURITY")
	private double nonRefundableSecurity;

	@Column(name = "ADMIN_CHARGES")
	private double adminCharges;

	@Column(name = "BOOKING_AMOUNT")
	private double bookingAmount;

	@Column(name = "AGGREGATED_BOOKING_AMOUNT")
	private double aggregatedBookingAmount;

	@Column(name = "ADVANCE_RENTAL")
	private double advanceRental;

	@Column(name = "ADVANCE_RENTAL_MONTHS")
	private int advanceRentalMonths;

	@Column(name = "ADVANCE_AMOUNT")
	private double advanceAmount;

	@Column(name = "TOTAL_AMOUNT")
	private double totalAmount;
	
	public double getSecurityDeposit() {
		return securityDeposit;
	}

	public void setSecurityDeposit(double securityDeposit) {
		this.securityDeposit = securityDeposit;
	}

	public double getMaintenanceFee() {
		return maintenanceFee;
	}

	public void setMaintenanceFee(double maintenanceFee) {
		this.maintenanceFee = maintenanceFee;
	}

	@Column(name = "SECURITY_DEPOSIT")
	private double securityDeposit;
	
	@Column(name = "MAINTENANCE_FEE")
	private double maintenanceFee;
	
	@Getter
	@Setter
	@Column(name = "INITIAL_ADVANCE_RENTAL_MONTHS")
	private Integer initialAdvanceRentalMonths;

	@Getter
	@Setter
	@Column(name = "SALES_BUFFER_PRICE")
	private double salesBufferPrice;
	
	@Getter
	@Setter
	@Column(name = "MAINTENANCE_FEE_SELECTION_ID")
	private MaintenanceFeeType maintenanceFeeSelectionId;

	@Getter
	@Setter
	@Column(name = "COMMERCIALS_CARD_ID")
	private Integer selectedCommercialCardId;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public double getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public double getMandatoryServicePrice() {
		return mandatoryServicePrice;
	}

	public void setMandatoryServicePrice(double mandatoryServicePrice) {
		this.mandatoryServicePrice = mandatoryServicePrice;
	}

	public double getOptionalServicePrice() {
		return optionalServicePrice;
	}

	public void setOptionalServicePrice(double optionalServicePrice) {
		this.optionalServicePrice = optionalServicePrice;
	}

	
	public double getVasPrice() {
		return vasPrice;
	}

	public void setVasPrice(double vasPrice) {
		this.vasPrice = vasPrice;
	}

	public double getRefundableSecurity() {
		return refundableSecurity;
	}

	public void setRefundableSecurity(double refundableSecurity) {
		this.refundableSecurity = refundableSecurity;
	}

	public double getNonRefundableSecurity() {
		return nonRefundableSecurity;
	}

	public void setNonRefundableSecurity(double nonRefundableSecurity) {
		this.nonRefundableSecurity = nonRefundableSecurity;
	}

	public double getAdminCharges() {
		return adminCharges;
	}

	public void setAdminCharges(double adminCharges) {
		this.adminCharges = adminCharges;
	}

	public double getAdvanceAmount() {
		return advanceAmount;
	}

	public void setAdvanceAmount(double advanceAmount) {
		this.advanceAmount = Math.round(advanceAmount * 1D) / 1D;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public double getBookingAmount() {
		return bookingAmount;
	}

	public void setBookingAmount(double bookingAmount) {
		this.bookingAmount = Math.round(bookingAmount * 1D) / 1D;
	}

	public double getAdvanceRental() {
		return advanceRental;
	}

	public void setAdvanceRental(double advanceRental) {
		this.advanceRental = advanceRental;
	}

	public double getCgst() {
		return cgst;
	}

	public void setCgst(double cgst) {
		this.cgst = cgst;
	}

	public double getSgst() {
		return sgst;
	}

	public void setSgst(double sgst) {
		this.sgst = sgst;
	}

	public double getIgst() {
		return igst;
	}

	public void setIgst(double igst) {
		this.igst = igst;
	}

	public int getAdvanceRentalMonths() {
		return advanceRentalMonths;
	}

	public void setAdvanceRentalMonths(int advanceRentalMonths) {
		this.advanceRentalMonths = advanceRentalMonths;
	}

	public double getBufferPrice() {
		return bufferPrice;
	}

	public void setBufferPrice(double bufferPrice) {
		this.bufferPrice = bufferPrice;
	}
	public double getAggregatedBookingAmount() {
		return aggregatedBookingAmount;
	}

	public void setAggregatedBookingAmount(double aggregatedBookingAmount) {
		this.aggregatedBookingAmount = aggregatedBookingAmount;
	}

}
