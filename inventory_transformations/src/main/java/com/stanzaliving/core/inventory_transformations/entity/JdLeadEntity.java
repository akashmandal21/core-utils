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
	@JsonProperty("lead_id")
    private String leadId;

    @Column(name = "LEAD_TYPE")
	@JsonProperty("lead_type")
    private String leadType;

    @Column(name = "PREFIX")
	@JsonProperty("prefix")
    private String PREFIX;

    @Column(name = "NAME")
	@JsonProperty("name")
    private String NAME;

    @Column(name = "MOBILE")
	@JsonProperty("mobile")
    private String MOBILE;

    @Column(name = "PHONE")
	@JsonProperty("phone")
    private String PHONE;

    @Column(name = "EMAIL")
	@JsonProperty("email")
    private String EMAIL;

    @Column(name = "LEAD_DATE")
	@JsonProperty("lead_date")
    private Timestamp leadDate;

    @Column(name = "CATEGORY")
	@JsonProperty("category")
    private String CATEGORY;

    @Column(name = "CITY")
	@JsonProperty("city")
    private String CITY;

    @Column(name = "AREA")
	@JsonProperty("area")
    private String AREA;

    @Column(name = "BRANCH_AREA")
	@JsonProperty("branch_area")
    private String branchArea;

    @Column(name = "DNC_MOBILE")
	@JsonProperty("dnc_mobile")
    private Integer dncMobile = 0;

    @Column(name = "DNC_PHONE")
	@JsonProperty("dnc_phone")
    private Integer dncPhone = 0;

    @Column(name = "COMPANY")
	@JsonProperty("company")
    private String COMPANY;

    @Column(name = "PINCODE")
	@JsonProperty("pincode")
    private String PINCODE;

    @Column(name = "LEAD_TIME")
	@JsonProperty("lead_time")
    private String leadTime;

    @Column(name = "BRANCH_PIN")
	@JsonProperty("branch_pin")
    private String branchPin;

    @Column(name = "PARENT_ID")
	@JsonProperty("parent_id")
    private String parentId;

    
}