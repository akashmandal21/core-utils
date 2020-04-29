package com.stanzaliving.core.inventory_transformations.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import java.util.Date;

@NamedQueries({
	  @NamedQuery(name="findAllServAuditIdByBooking",
	              query="SELECT servAudit FROM BookingServiceAudit servAudit join servAudit.bookingAudit bookingAudit WHERE bookingAudit.student = :studentId"
	              		+ " and bookingAudit.bookingStatus = \'ONBOARDING COMPLETED\' " )
	})


@Getter
@Setter
@Entity
@Table(name = "BOOKING_SERVICE_AUDIT")
public class BookingServiceAudit {

	@Id
	@GeneratedValue
	@Column(name = "BOOKING_SERVICE_AUDIT_ID")
	private int bookingServicesAuditId;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "BOOKING_AUDIT_ID")
	private BookingAudit bookingAudit;

	@Column(name = "SERVICE_ID")
	private int serviceId;

	@Column(name = "SERVICE_NAME")
	private String serviceName;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "OPTIONAL")
	private boolean optional;
	
	@Column(name = "VALID_FROM")
	private Date vaidFrom;
	
	@Column(name = "VALID_TO")
	private Date validTo;

	@Column(name = "VAS")
	private boolean isVas;

}
