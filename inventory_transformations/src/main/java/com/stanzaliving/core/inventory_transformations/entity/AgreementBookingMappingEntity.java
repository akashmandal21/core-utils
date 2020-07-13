package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "AGREEMENT_BOOKING_MAPPING")
@Data
@Entity
public class AgreementBookingMappingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "AGREEMENT_DOCUMENT_ID")
	@JsonProperty("AGREEMENT_DOCUMENT_ID")
    private String agreementDocumentId;

    @Column(name = "STUDENT_ID")
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "AGREEMENT_URL")
	@JsonProperty("AGREEMENT_URL")
    private String agreementUrl;

    @Column(name = "BOOKING_ID")
	@JsonProperty("BOOKING_ID")
    private Integer bookingId;

    
}