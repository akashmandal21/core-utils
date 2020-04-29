package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="uniworld_guest")
public class Uniworld {
	
	@Id
	@GeneratedValue
	@Column(name ="S_No")
	private int id;
	
	@Column(name = "ReservationNo")
	private String reservationNo;
	
	@Column(name = "GuestFullName")
	private String guestFullName;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Phone")
	private String phone;
	
	@Column(name = "CompanyName")
	private String companyName;
	
	@Column(name = "RateCardName")
	private String rateCardName;
	
	@Column(name = "RoomTypeName")
	private String roomTypeName;
	
	@Column(name = "CheckInDate")
	private Date checkInDate;
	
	@Column(name = "CheckOutDate")
	private Date checkOutDate;
	
	@Column(name = "RoomNo")
	private String roomNo;
	
	@Column(name = "Security_Deposit")
	private Integer security_Deposit;
	
	@Column(name = "Excess_Rental")
	private Integer excess_Rental;

	@Column(name = "plan")
	private String plan;
	
	@Column(name = "Total_Amount")
	private Integer total_Amount;
	
	@Column(name = "Confirmation_Code")
	private String confirmationCode;
	
	@Column(name = "Accepted")
	private int accepted = 0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReservationNo() {
		return reservationNo;
	}

	public void setReservationNo(String reservationNo) {
		this.reservationNo = reservationNo;
	}

	public String getGuestFullName() {
		return guestFullName;
	}

	public void setGuestFullName(String guestFullName) {
		this.guestFullName = guestFullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRateCardName() {
		return rateCardName;
	}

	public void setRateCardName(String rateCardName) {
		this.rateCardName = rateCardName;
	}

	public String getRoomTypeName() {
		return roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public Integer getSecurity_Deposit() {
		return security_Deposit;
	}

	public void setSecurity_Deposit(Integer security_Deposit) {
		this.security_Deposit = security_Deposit;
	}

	public Integer getExcess_Rental() {
		return excess_Rental;
	}

	public void setExcess_Rental(Integer excess_Rental) {
		this.excess_Rental = excess_Rental;
	}

	public Integer getTotal_Amount() {
		return total_Amount;
	}

	public void setTotal_Amount(Integer total_Amount) {
		this.total_Amount = total_Amount;
	}

	public String getConfirmationCode() {
		return confirmationCode;
	}

	public void setConfirmationCode(String confirmationCode) {
		this.confirmationCode = confirmationCode;
	}

	public int getAccepted() {
		return accepted;
	}

	public void setAccepted(int accepted) {
		this.accepted = accepted;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

}
