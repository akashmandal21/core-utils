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
	@JsonProperty("ORDERID")
    private Integer ORDERID;

    @Column(name = "AMOUNT")
	@JsonProperty("AMOUNT")
    private Double AMOUNT;

    @Column(name = "STATUS")
	@JsonProperty("STATUS")
    private String STATUS;

    @Column(name = "STUDENT_ID")
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "STUDENT_NAME")
	@JsonProperty("STUDENT_NAME")
    private String studentName;

    @Column(name = "SENDER_NAME")
	@JsonProperty("SENDER_NAME")
    private String senderName;

    @Column(name = "CREATED_AT")
	@JsonProperty("CREATED_AT")
    private Timestamp createdAt;

    @Column(name = "SETTLEMENT_DATE")
	@JsonProperty("SETTLEMENT_DATE")
    private Timestamp settlementDate;

    @Column(name = "CHARGES")
	@JsonProperty("CHARGES")
    private Double CHARGES;

    @Column(name = "TDS")
	@JsonProperty("TDS")
    private Double TDS;

    @Column(name = "GST")
	@JsonProperty("GST")
    private Double GST;

    @Column(name = "TOTAL_CHARGES")
	@JsonProperty("TOTAL_CHARGES")
    private Double totalCharges;

    @Column(name = "TOTAL_PAYOUT")
	@JsonProperty("TOTAL_PAYOUT")
    private Double totalPayout;

    
}