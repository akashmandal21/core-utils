package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "AGREEMENT_BOOKING_MAPPING")
@Entity
@Data
public class AgreementBookingMapping implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "AGREEMENT_DOCUMENT_ID")
    private String agreementDocumentId;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "AGREEMENT_URL")
    private String agreementUrl;

    @Column(name = "BOOKING_ID")
    private Integer bookingId;

    
}