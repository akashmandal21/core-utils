package com.stanzaliving.core.inventory_transformations.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "BOOKING_ATTRIBUTE_AUDIT")
public class BookingAttributeAudit {

	@Id
	@GeneratedValue
	@Column(name = "BOOKING_ATTRIBUTE_AUDIT_ID")
	private int bookingAttributeAuditId;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "BOOKING_AUDIT_ID")
	private BookingAudit bookingAudit;

	@Column(name = "ATTRIBUTE_ID")
	private int attributeId;

	@Column(name = "ATTRIBUTE_NAME")
	private String attributeName;

	@Column(name = "ATTRIBUTE_PRICE")
	private int attributePrice;

	public int getBookingAttributeAuditId() {
		return bookingAttributeAuditId;
	}

	public void setBookingAttributeAuditId(int bookingAttributeAuditId) {
		this.bookingAttributeAuditId = bookingAttributeAuditId;
	}

	public BookingAudit getBookingAudit() {
		return bookingAudit;
	}

	public void setBookingAudit(BookingAudit bookingAudit) {
		this.bookingAudit = bookingAudit;
	}

	public int getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public int getAttributePrice() {
		return attributePrice;
	}

	public void setAttributePrice(int attributePrice) {
		this.attributePrice = attributePrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attributeId;
		result = prime * result + ((attributeName == null) ? 0 : attributeName.hashCode());
		result = prime * result + ((bookingAudit == null) ? 0 : bookingAudit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof BookingAttributeAudit))
			return false;
		BookingAttributeAudit other = (BookingAttributeAudit) obj;
		if (attributeId != other.attributeId)
			return false;
		if (attributeName == null) {
			if (other.attributeName != null)
				return false;
		} else if (!attributeName.equals(other.attributeName))
			return false;
		if (bookingAudit == null) {
			if (other.bookingAudit != null)
				return false;
		} else if (bookingAudit.getBookingAuditId() != (other.bookingAudit.getBookingAuditId()))
			return false;
		return true;
	}

}
