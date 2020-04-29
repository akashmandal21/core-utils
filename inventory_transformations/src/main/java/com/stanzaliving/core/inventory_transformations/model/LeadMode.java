package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name="LEAD_MODE")
public class LeadMode {
	
	@Id()
	@GeneratedValue
	@Column(name="LEAD_MODE_ID",nullable=false)
	private int leadModeId;
	
	@Column(name="LEAD_MODE",nullable=false)
	private String leadMode;
	
	@Column(name="LEAD_SUB_MODE")
	private String leadSubMode;

	public int getLeadModeId() {
		return leadModeId;
	}

	public void setLeadModeId(int leadModeId) {
		this.leadModeId = leadModeId;
	}

	public String getLeadMode() {
		return leadMode;
	}

	public void setLeadMode(String leadMode) {
		this.leadMode = leadMode;
	}

	public String getLeadSubMode() {
		return leadSubMode;
	}

	public void setLeadSubMode(String leadSubMode) {
		this.leadSubMode = leadSubMode;
	}

	
	

}
