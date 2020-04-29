package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "RESIDENCE_RC")
public class ResidenceRc {

	@Id
	@GeneratedValue
	@Column(name = "RESIDENCE_RC_ID")
	private int residenceRcId;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "PAYMONK_SENDER_ID", nullable = false)
	private String paymonkSenderId;

	@Column(name = "PHONE", nullable = false)
	private String phone;

	@Column(name = "CREATED", nullable = false)
	private Date created = new Date();

	@Column(name = "UPDATED", nullable = false)
	private Date updated = new Date();

	@Column(name = "ENABLED", nullable = false)
	private boolean enabled = true;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "residenceRc")
	private Set<Residence> residences = new HashSet<>(0);
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getResidenceRcId() {
		return residenceRcId;
	}

	public void setResidenceRcId(int residenceRcId) {
		this.residenceRcId = residenceRcId;
	}

	public String getPaymonkSenderId() {
		return paymonkSenderId;
	}

	public void setPaymonkSenderId(String paymonkSenderId) {
		this.paymonkSenderId = paymonkSenderId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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


}
