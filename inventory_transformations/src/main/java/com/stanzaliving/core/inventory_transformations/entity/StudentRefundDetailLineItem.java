package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "STUDENT_REFUND_DETAIL_LINE_ITEM")
@Data
@Entity
public class StudentRefundDetailLineItem implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REFUND_DETAIL_LINE_ITEM_ID", insertable = false, nullable = false)
    private Integer refundDetailLineItemId;

    @Column(name = "DAMAGES_AMOUNT")
    private Double damagesAmount;

    @Column(name = "DOCUMENT_LINK")
    private String documentLink;

    @Column(name = "REFUND_AMOUNT")
    private Double refundAmount;

    @Column(name = "STUDENT_REFUND_DETAIL_ID")
    private Integer studentRefundDetailId;

    
}