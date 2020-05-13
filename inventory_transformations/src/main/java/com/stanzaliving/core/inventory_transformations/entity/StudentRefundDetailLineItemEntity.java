package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "STUDENT_REFUND_DETAIL_LINE_ITEM")
@Data
@Entity
public class StudentRefundDetailLineItemEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REFUND_DETAIL_LINE_ITEM_ID", insertable = false, nullable = false)
	@JsonProperty("refund_detail_line_item_id")
    private Integer refundDetailLineItemId;

    @Column(name = "DAMAGES_AMOUNT")
	@JsonProperty("damages_amount")
    private Double damagesAmount;

    @Column(name = "DOCUMENT_LINK")
	@JsonProperty("document_link")
    private String documentLink;

    @Column(name = "REFUND_AMOUNT")
	@JsonProperty("refund_amount")
    private Double refundAmount;

    @Column(name = "STUDENT_REFUND_DETAIL_ID")
	@JsonProperty("student_refund_detail_id")
    private Integer studentRefundDetailId;

    
}