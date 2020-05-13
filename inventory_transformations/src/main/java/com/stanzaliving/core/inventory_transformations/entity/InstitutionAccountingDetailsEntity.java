package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "INSTITUTION_ACCOUNTING_DETAILS")
@Entity
public class InstitutionAccountingDetailsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "INSTITUTION_ID", nullable = false)
	@JsonProperty("institution_id")
    private Integer institutionId;

    @Column(name = "ACCOUNTS_EMAIL", nullable = false)
	@JsonProperty("accounts_email")
    private String accountsEmail;

    @Column(name = "ACCOUNTS_Phone", nullable = false)
	@JsonProperty("accounts_phone")
    private String accountsPhone;

    @Column(name = "ACCOUNTS_POC", nullable = false)
	@JsonProperty("accounts_poc")
    private String accountsPoc;

    @Column(name = "GST_NUMBER", nullable = false)
	@JsonProperty("gst_number")
    private String gstNumber;

    @Column(name = "PAN_NUMBER", nullable = false)
	@JsonProperty("pan_number")
    private String panNumber;

    
}