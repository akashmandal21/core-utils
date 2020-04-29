package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "BOOKING_SERVICE")
public class BookingService {

	@Id
	@GeneratedValue
	@Column(name = "BOOKING_SERVICE_ID")
	private int bookingServicesId;

	@ManyToOne(fetch=FetchType.LAZY, optional=true)
    @JoinColumn(name = "BOOKING_ID")
    private Booking booking;

	@Column(name = "SERVICE_ID")
	private int serviceId;

	@Column(name = "SERVICE_NAME")
	private String serviceName;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "OPTIONAL")
	private boolean optional;

	@Column(name = "VAS")
	private boolean isVas;
	
	@Column(name = "IS_ACTIVE")
	private boolean isActive;


	public int getBookingServicesId() {
		return bookingServicesId;
	}

	public void setBookingServicesId(int bookingServicesId) {
		this.bookingServicesId = bookingServicesId;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isOptional() {
		return optional;
	}

	public void setOptional(boolean optional) {
		this.optional = optional;
	}


	public boolean isVas() {
		return isVas;
	}

	public void setVas(boolean isVas) {
		this.isVas = isVas;
	}
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + serviceId;
		result = prime * result + ((serviceName == null) ? 0 : serviceName.hashCode());
		result = prime * result + ((booking == null) ? 0 : (booking.getBookingId()==null?0:booking.getBookingId()));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof BookingService))
			return false;
		BookingService other = (BookingService) obj;
		if (serviceId != other.serviceId)
			return false;
		if (serviceName == null) {
			if (other.serviceName != null)
				return false;
		} else if (!serviceName.equals(other.serviceName))
			return false;
		if (booking == null) {
			if (other.booking != null)
				return false;
		} else if (booking.getBookingId() != (other.booking.getBookingId()))
			return false;
		return true;
	}
}
