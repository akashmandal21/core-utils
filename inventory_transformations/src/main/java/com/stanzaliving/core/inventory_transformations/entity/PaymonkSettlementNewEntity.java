package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "PAYMONK_SETTLEMENT_NEW")
@Data
public class PaymonkSettlementNewEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "ORDERID", nullable = false)
	@JsonProperty("orderid")
    private Integer ORDERID;

    @Column(name = "AMOUNT")
	@JsonProperty("amount")
    private Double AMOUNT;

    @Column(name = "STATUS")
	@JsonProperty("status")
    private String STATUS;

    @Column(name = "STUDENT_ID")
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "STUDENT_NAME")
	@JsonProperty("student_name")
    private String studentName;

    @Column(name = "SENDER_NAME")
	@JsonProperty("sender_name")
    private String senderName;

    @Column(name = "CREATED_AT")
	@JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(name = "SETTLEMENT_DATE")
	@JsonProperty("settlement_date")
    private Timestamp settlementDate;

    @Column(name = "CHARGES")
	@JsonProperty("charges")
    private Double CHARGES;

    @Column(name = "TDS")
	@JsonProperty("tds")
    private Double TDS;

    @Column(name = "GST")
	@JsonProperty("gst")
    private Double GST;

    @Column(name = "TOTAL_CHARGES")
	@JsonProperty("total_charges")
    private Double totalCharges;

    @Column(name = "TOTAL_PAYOUT")
	@JsonProperty("total_payout")
    private Double totalPayout;

    
}