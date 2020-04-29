package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "UPGRADE")
public class Upgrade {

	@Id()
	@GeneratedValue
	@Column(name = "UPGRADE_ID")
	private int upgradeId;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "CREATED", nullable = false)
	private Date created = new Date();

	@Column(name = "UPDATED", nullable = false)
	private Date updated = new Date();

	@Column(name = "ENABLED", nullable = false)
	private boolean enabled = true;

	public int getUpgradeId() {
		return upgradeId;
	}

	public void setUpgradeId(int upgradeId) {
		this.upgradeId = upgradeId;
	}

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

}
