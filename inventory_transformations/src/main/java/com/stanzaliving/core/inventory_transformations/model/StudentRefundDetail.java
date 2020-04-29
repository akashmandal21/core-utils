package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "STUDENT_REFUND_DETAIL")
public class StudentRefundDetail {

	@Id
	@GeneratedValue
	@Column(name = "REFUND_ID")
	private int refundId;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "STUDENT_ID")
	private Student student;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "BOOKING_ID")
	private Booking booking;

	@Column(name = "REFUND_STATUS")
	private String refundStatus;

	@OneToMany(mappedBy = "studentRefundDetail", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	private Set<StudentRefundDetailLineItem> invoiceLineItems = new HashSet<>(0);

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "REMINDER_COUNT")
	private int reminderCount;

	public int getRefundId() {
		return refundId;
	}

	public void setRefundId(int refundId) {
		this.refundId = refundId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Set<StudentRefundDetailLineItem> getInvoiceLineItems() {
		return invoiceLineItems;
	}

	public void setInvoiceLineItems(Set<StudentRefundDetailLineItem> invoiceLineItems) {
		this.invoiceLineItems = invoiceLineItems;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public int getReminderCount() {
		return reminderCount;
	}

	public void setReminderCount(int reminderCount) {
		this.reminderCount = reminderCount;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public String getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

}
