package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "BOOKING_ATTRIBUTE")
public class BookingAttribute {

	@Id
	@GeneratedValue
	@Column(name = "BOOKING_ATTRIBUTE_ID")
	private int bookingAttributeId;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=true)
    @JoinColumn(name = "BOOKING_ID")
    private Booking booking;
	
	@Column(name = "ATTRIBUTE_ID")
	private int attributeId;
	
	@Column(name = "ATTRIBUTE_NAME")
	private String attributeName;
	
	@Column(name = "ATTRIBUTE_PRICE")
	private int attributePrice;

	public int getBookingAttributeId() {
		return bookingAttributeId;
	}

	public void setBookingAttributeId(int bookingAttributeId) {
		this.bookingAttributeId = bookingAttributeId;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
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
		result = prime * result + ((booking == null) ? 0 : booking.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof BookingAttribute))
			return false;
		BookingAttribute other = (BookingAttribute) obj;
		if (attributeId != other.attributeId)
			return false;
		if (attributeName == null) {
			if (other.attributeName != null)
				return false;
		} else if (!attributeName.equals(other.attributeName))
			return false;
		if (booking == null) {
			if (other.booking != null)
				return false;
		} else if (booking.getBookingId() != (other.booking.getBookingId()))
			return false;
		return true;
	}
	
}
