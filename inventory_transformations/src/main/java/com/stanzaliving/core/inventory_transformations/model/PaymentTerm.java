package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PAYMENT_TERM")
public class PaymentTerm {
	
	@Id
	@GeneratedValue
	@Column(name="PAYMENT_TERM_ID")
	private int paymentTermId;
	
	@Column(name="NAME",nullable=false)
	private String name;
	
	@Column(name="INSTALLMENTS",nullable=false)
	private int installments;
	
	@Column(name="IS_MONTHLY",nullable=true)
	private boolean isMonthly;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "paymentTerms")
	private Set<Residence> residences = new HashSet<>(0);
	
	@Column(name="CREATED", nullable=false)
	private Date created = new Date();
	
	@Column(name="UPDATED", nullable=false)
	private Date updated = new Date();
	
	@Column(name="ENABLED", nullable=false)
	private boolean enabled = true;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public int getPaymentTermId() {
		return paymentTermId;
	}

	public void setPaymentTermId(int paymentTermId) {
		this.paymentTermId = paymentTermId;
	}

	public int getInstallments() {
		return installments;
	}

	public void setInstallments(int installments) {
		this.installments = installments;
	}

	public boolean isMonthly() {
		return isMonthly;
	}

	public void setMonthly(boolean isMonthly) {
		this.isMonthly = isMonthly;
	}

	public Set<Residence> getResidences() {
		return residences;
	}

	public void setResidences(Set<Residence> residences) {
		this.residences = residences;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (enabled ? 1231 : 1237);
		result = prime * result + installments;
		result = prime * result + (isMonthly ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + paymentTermId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof PaymentTerm))
			return false;
		PaymentTerm other = (PaymentTerm) obj;
		if (enabled != other.enabled)
			return false;
		if (installments != other.installments)
			return false;
		if (isMonthly != other.isMonthly)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (paymentTermId != other.paymentTermId)
			return false;
		return true;
	}
	
}
