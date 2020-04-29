package com.stanzaliving.core.inventory_transformations.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "BOOKING_CANCELLED_STATUS")
public class BookingCancelledStatus {

	@Id
	@GeneratedValue
	@Column(name="BOOKING_CANCELLED_STATUS_ID")
	private int bookingCancelledStatusId;

	@OneToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "BOOKING_ID")
	private Booking booking;
	
	@Column(name="BOOKING_SUB_STATUS")
	private String bookingSubStatus;
	
	@Column(name="COMMENTS")
	private String comments;

	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name="ENABLED", nullable=false)
	private boolean enabled = true;

}
