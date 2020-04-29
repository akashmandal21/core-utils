package com.stanzaliving.core.inventory_transformations.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "JD_LEAD")
public class JDLead {
	
	@Id
	@Column(name = "LEAD_ID")
	private String leadId;

	@Column(name = "LEAD_TYPE")
	private String leadType;

	@Column(name = "PREFIX")
	private String prefix;

	@Column(name = "NAME")
	private String name;
	
	@Column(name = "MOBILE")
	private String mobile;
	
	@Column(name = "PHONE")
	private String phone;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "LEAD_DATE")
	private Date leadDate;

	@Column(name = "COMPANY")
	private String company;
	
	@Column(name = "CATEGORY")
	private String category;

	@Column(name = "PINCODE")
	private String pincode;

	@Column(name = "LEAD_TIME")
	private String leadTime;

	@Column(name = "BRANCH_PIN")
	private String branchPin;

	@Column(name = "PARENT_ID")
	private String parentId;
	
	@Column(name = "CITY")
	private String city;

	@Column(name = "AREA")
	private String area;

	@Column(name = "BRANCH_AREA")
	private String branchArea;

	@Column(name = "DNC_MOBILE")
	private int dncMobile;

	@Column(name = "DNC_PHONE")
	private int dncPhone;

	
}
