package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "STUDENT_LEDGER")
public class StudentLedger {

	
	@Id
	@GeneratedValue
	@Column(name = "LEDGER_ID")
	private int ledgerId;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "STUDENT_ID")
	private Student student;
	
	@Column(name = "TYPE")
	private String type;
	
	@Column(name = "DEBIT")
	private double debit;
	
	@Column(name = "CREDIT")
	private double credit;
	
	@Column(name = "BALANCE")
	private double balance;
	
	@Column(name = "CREATED")
	private Date created = new Date();

	@Column(name = "BOOKING_ID")
	private Integer bookingId;

	public int getLedgerId() {
		return ledgerId;
	}

	public void setLedgerId(int ledgerId) {
		this.ledgerId = ledgerId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getDebit() {
		return debit;
	}

	public void setDebit(double debit) {
		this.debit = debit;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public StudentLedger() {
	}

	public StudentLedger(Integer ledgerId, String type, double debit, double credit, double balance, Date created) {
		this.ledgerId = ledgerId;
		this.type = type;
		this.debit = debit;
		this.credit = credit;
		this.balance = balance;
		this.created = created;
	}

	@Override
	public String toString() {
		return "StudentLedger{" +
				"ledgerId=" + ledgerId +
				", student=" + student +
				", type='" + type + '\'' +
				", debit=" + debit +
				", credit=" + credit +
				", balance=" + balance +
				", created=" + created +
				'}';
	}

	//	@Override
//	public String toString() {
//		return "INSERT INTO `STUDENT_LEDGER` (`BALANCE`, `CREDIT`, `DEBIT`, `TYPE`, `STUDENT_ID`, `CREATED`) VALUES " +
//				"("+this.balance+", "+this.credit+", "+this.debit+", '"+this.type+"', '"+this.student.getStudentId()+"', now());";
//	}
}
