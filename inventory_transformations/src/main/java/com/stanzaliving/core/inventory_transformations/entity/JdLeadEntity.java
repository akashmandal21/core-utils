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
@Data
@Table(name = "JD_LEAD")
public class JdLeadEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "LEAD_ID", insertable = false, nullable = false)
	@JsonProperty("LEAD_ID")
    private String leadId;

    @Column(name = "LEAD_TYPE")
	@JsonProperty("LEAD_TYPE")
    private String leadType;

    @Column(name = "PREFIX")
	@JsonProperty("PREFIX")
    private String PREFIX;

    @Column(name = "NAME")
	@JsonProperty("NAME")
    private String NAME;

    @Column(name = "MOBILE")
	@JsonProperty("MOBILE")
    private String MOBILE;

    @Column(name = "PHONE")
	@JsonProperty("PHONE")
    private String PHONE;

    @Column(name = "EMAIL")
	@JsonProperty("EMAIL")
    private String EMAIL;

    @Column(name = "LEAD_DATE")
	@JsonProperty("LEAD_DATE")
    private Timestamp leadDate;

    @Column(name = "CATEGORY")
	@JsonProperty("CATEGORY")
    private String CATEGORY;

    @Column(name = "CITY")
	@JsonProperty("CITY")
    private String CITY;

    @Column(name = "AREA")
	@JsonProperty("AREA")
    private String AREA;

    @Column(name = "BRANCH_AREA")
	@JsonProperty("BRANCH_AREA")
    private String branchArea;

    @Column(name = "DNC_MOBILE")
	@JsonProperty("DNC_MOBILE")
    private Integer dncMobile = 0;

    @Column(name = "DNC_PHONE")
	@JsonProperty("DNC_PHONE")
    private Integer dncPhone = 0;

    @Column(name = "COMPANY")
	@JsonProperty("COMPANY")
    private String COMPANY;

    @Column(name = "PINCODE")
	@JsonProperty("PINCODE")
    private String PINCODE;

    @Column(name = "LEAD_TIME")
	@JsonProperty("LEAD_TIME")
    private String leadTime;

    @Column(name = "BRANCH_PIN")
	@JsonProperty("BRANCH_PIN")
    private String branchPin;

    @Column(name = "PARENT_ID")
	@JsonProperty("PARENT_ID")
    private String parentId;

    
}