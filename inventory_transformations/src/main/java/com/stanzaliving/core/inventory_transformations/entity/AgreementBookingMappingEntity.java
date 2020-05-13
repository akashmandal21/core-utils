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
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "AGREEMENT_DOCUMENT_ID")
	@JsonProperty("agreement_document_id")
    private String agreementDocumentId;

    @Column(name = "STUDENT_ID")
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "AGREEMENT_URL")
	@JsonProperty("agreement_url")
    private String agreementUrl;

    @Column(name = "BOOKING_ID")
	@JsonProperty("booking_id")
    private Integer bookingId;

    
}