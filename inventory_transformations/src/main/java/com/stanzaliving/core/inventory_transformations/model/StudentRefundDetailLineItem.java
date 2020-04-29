package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT_REFUND_DETAIL_LINE_ITEM")
public class StudentRefundDetailLineItem {
	
	@Id
	@GeneratedValue
	@Column(name = "REFUND_DETAIL_LINE_ITEM_ID")
	private int refundDetailItemLineId;
		
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "STUDENT_REFUND_DETAIL_ID")
	private StudentRefundDetail studentRefundDetail;
	
	@Column(name = "REFUND_AMOUNT")
	private double refundAmount;

	@Column(name = "DAMAGES_AMOUNT")
	private double damagesAmount;

	@Column(name = "DOCUMENT_LINK")
	private String documentLink;

	public int getRefundDetailItemLineId() {
		return refundDetailItemLineId;
	}

	public void setRefundDetailItemLineId(int refundDetailItemLineId) {
		this.refundDetailItemLineId = refundDetailItemLineId;
	}

	public StudentRefundDetail getStudentRefundDetail() {
		return studentRefundDetail;
	}

	public void setStudentRefundDetail(StudentRefundDetail studentRefundDetail) {
		this.studentRefundDetail = studentRefundDetail;
	}

	public double getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(double refundAmount) {
		this.refundAmount = refundAmount;
	}

	public double getDamagesAmount() {
		return damagesAmount;
	}

	public void setDamagesAmount(double damagesAmount) {
		this.damagesAmount = damagesAmount;
	}

	public String getDocumentLink() {
		return documentLink;
	}

	public void setDocumentLink(String documentLink) {
		this.documentLink = documentLink;
	}

	
}
