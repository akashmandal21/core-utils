package com.stanzaliving.core.inventory_transformations.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "BROKER_LEAD_TRANSACTION")
public class BrokerLeadTransaction {
	
	@Id()
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="BROKER_ID")
	private Broker brokerId;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="LEAD_ID")
	private Lead leadId;
	
	@Column(name = "COMMISSION", nullable = false)
	private int commission;
	
	@Column(name = "CREATED", nullable = false)
	private Date created = new Date();

	@Column(name = "UPDATED", nullable = false)
	private Date updated = new Date();
	
	@Column(name = "COMMISSION_PROCESSED", nullable = false)
	private Boolean commissionProcessed = false;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Broker getBrokerId() {
		return brokerId;
	}

	public void setBrokerId(Broker brokerId) {
		this.brokerId = brokerId;
	}

	public Lead getLeadId() {
		return leadId;
	}

	public void setLeadId(Lead leadId) {
		this.leadId = leadId;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public Boolean getCommissionProcessed() {
		return commissionProcessed;
	}

	public void setCommissionProcessed(Boolean commissionProcessed) {
		this.commissionProcessed = commissionProcessed;
	}
}
