package com.stanzaliving.core.inventory_transformations.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
@Entity
@Table(name = "AGREEMENT_BOOKING_MAPPING")
public class AgreementBookingMapping {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;

	@Column(name = "AGREEMENT_DOCUMENT_ID")
	private String agreementDocumentId;

	@Column(name = "AGREEMENT_URL")
	private String agreementUrl;

	@Column(name = "STUDENT_ID")
	private String studentId;

	@Column(name = "BOOKING_ID")
	private Integer bookingId;

}
