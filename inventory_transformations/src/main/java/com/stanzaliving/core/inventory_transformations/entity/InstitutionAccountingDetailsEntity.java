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
	@JsonProperty("INSTITUTION_ID")
    private Integer institutionId;

    @Column(name = "ACCOUNTS_EMAIL", nullable = false)
	@JsonProperty("ACCOUNTS_EMAIL")
    private String accountsEmail;

    @Column(name = "ACCOUNTS_Phone", nullable = false)
	@JsonProperty("ACCOUNTS_PHONE")
    private String accountsPhone;

    @Column(name = "ACCOUNTS_POC", nullable = false)
	@JsonProperty("ACCOUNTS_POC")
    private String accountsPoc;

    @Column(name = "GST_NUMBER", nullable = false)
	@JsonProperty("GST_NUMBER")
    private String gstNumber;

    @Column(name = "PAN_NUMBER", nullable = false)
	@JsonProperty("PAN_NUMBER")
    private String panNumber;

    
}