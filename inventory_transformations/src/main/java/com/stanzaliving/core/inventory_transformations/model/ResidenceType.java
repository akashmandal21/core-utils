package com.stanzaliving.core.inventory_transformations.model;//package com.stanzaliving.inventory.model;
//
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//
//
//@Entity
//@Table(name ="RESIDENCE_TYPE")
//public class ResidenceType {
//	
//	@Id
//	@GeneratedValue
//	@Column(name = "RESIDENCE_TYPE_ID")
//	private int residenceTypeId;
//	
////	@ManyToOne(fetch=FetchType.EAGER)
////	@Join
//	@Column(name = "RESIDENCE_ID")
//	private int residenceId;
//	
//	@Column(name = "REFUNDABLE_SECURITY_DEPOSIT", nullable = true)
//	private int refundableSecurityDeposit;
//
//	@Column(name = "NON_REFUNDABLE_SECURITY_DEPOSIT", nullable = true)
//	private int nonRefundableSecurityDeposit;
//
//	@Column(name = "ADMIN_CHARGES", nullable = true)
//	private int adminCharges;
//	
//	@Column(name = "RETENTION_BOOKING_AMOUNT")
//	private double retentionBookingAmount;
//	
//	@Column(name = "ADVANCE_RENTAL")
//	private int advanceRental = 3;
//	
//	@Column(name = "TYPE", nullable = false)
//	private UserType type;
//	
//	@Column(name = "PENALTY_AMOUNT")
//	private double penaltyAmount;
//	
//	@Column(name = "MAINTENANCE_FEE")
//	private double maintenanceFee;
//	
//	@Column(name = "VARIABLE_SECURITY_DEPOSIT")
//	private Double variableSecurityDeposit;
//
//	public Double getVariableSecurityDeposit() {
//		return variableSecurityDeposit;
//	}
//
//	public void setVariableSecurityDeposit(Double variableSecurityDeposit) {
//		this.variableSecurityDeposit = variableSecurityDeposit;
//	}
//
//	public double getMaintenanceFee() {
//		return maintenanceFee;
//	}
//
//	public void setMaintenanceFee(double maintenanceFee) {
//		this.maintenanceFee = maintenanceFee;
//	}
//
//	public double getPenaltyAmount() {
//		return penaltyAmount;
//	}
//
//	public void setPenaltyAmount(double penaltyAmount) {
//		this.penaltyAmount = penaltyAmount;
//	}
//
//	public int getResidenceTypeId() {
//		return residenceTypeId;
//	}
//
//	public void setResidenceTypeId(int residenceTypeId) {
//		this.residenceTypeId = residenceTypeId;
//	}
//
//	public int getResidenceId() {
//		return residenceId;
//	}
//
//	public void setResidenceId(int residenceId) {
//		this.residenceId = residenceId;
//	}
//
//	public int getRefundableSecurityDeposit() {
//		return refundableSecurityDeposit;
//	}
//
//	public void setRefundableSecurityDeposit(int refundableSecurityDeposit) {
//		this.refundableSecurityDeposit = refundableSecurityDeposit;
//	}
//
//	public int getNonRefundableSecurityDeposit() {
//		return nonRefundableSecurityDeposit;
//	}
//
//	public void setNonRefundableSecurityDeposit(int nonRefundableSecurityDeposit) {
//		this.nonRefundableSecurityDeposit = nonRefundableSecurityDeposit;
//	}
//
//	public int getAdminCharges() {
//		return adminCharges;
//	}
//
//	public void setAdminCharges(int adminCharges) {
//		this.adminCharges = adminCharges;
//	}
//
//	public double getRetentionBookingAmount() {
//		return retentionBookingAmount;
//	}
//
//	public void setRetentionBookingAmount(double retentionBookingAmount) {
//		this.retentionBookingAmount = retentionBookingAmount;
//	}
//
//	public int getAdvanceRental() {
//		return advanceRental;
//	}
//
//	public void setAdvanceRental(int advanceRental) {
//		this.advanceRental = advanceRental;
//	}
//
//	public UserType getType() {
//		return type;
//	}
//
//	public void setType(UserType type) {
//		this.type = type;
//	}
//
//	@Override
//	public String toString() {
//		return  " [type=" + type + ", advanceRental="
//				+ advanceRental + ", retentionBookingAmount=" + retentionBookingAmount + ", adminCharges="
//				+ adminCharges + ", nonRefundableSecurityDeposit=" + nonRefundableSecurityDeposit
//				+ ", refundableSecurityDeposit=" + refundableSecurityDeposit + ", penaltyAmount=" + penaltyAmount+ "]";
//	}
//
//}
