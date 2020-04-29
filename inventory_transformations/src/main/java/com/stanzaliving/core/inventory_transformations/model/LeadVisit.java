/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @author nipunaggarwal
 *
 */
@Entity
@Table(name = "LEAD_VISIT")
public class LeadVisit {

	@Id
	@GeneratedValue
	@Column(name = "LEAD_VISIT_ID")
	private int leadVisitId;

	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "LEAD_ID")
	private Lead lead;

	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "RESIDENCE_ID")
	private Residence residence;

	@Column(name = "VISIT_DATE")
	private Date visitDate;

	public int getLeadVisitId() {
		return leadVisitId;
	}

	public void setLeadVisitId(int leadVisitId) {
		this.leadVisitId = leadVisitId;
	}

	public Lead getLead() {
		return lead;
	}

	public void setLead(Lead lead) {
		this.lead = lead;
	}

	public Residence getResidence() {
		return residence;
	}

	public void setResidence(Residence residence) {
		this.residence = residence;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public LeadVisit(int leadVisitId, Lead lead, Residence residence, Date visitDate) {
		this.leadVisitId = leadVisitId;
		this.lead = lead;
		this.residence = residence;
		this.visitDate = visitDate;
	}
	
	public LeadVisit(Lead lead, Residence residence, Date visitDate) {
		this.lead = lead;
		this.residence = residence;
		this.visitDate = visitDate;
	}

	public LeadVisit() {
	}

	@Override
	public String toString() {
		return "LeadVisit [leadVisitId=" + leadVisitId + ", lead=" + lead + ", residence=" + residence + ", visitDate=" + visitDate + "]";
	}

}
