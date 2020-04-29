package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "APP_VERSION")
public class AppVersion {

	@Id
	@GeneratedValue
	@Column(name = "APP_VERSION_ID")
	private int appVersionId;

	@Column(name = "VERSION", nullable = false)
	private String version;

	@Column(name = "HARD_UPDATE", nullable = false)
	private boolean hardUpdate = true;

	public int getAppVersionId() {
		return appVersionId;
	}

	public void setAppVersionId(int appVersionId) {
		this.appVersionId = appVersionId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public boolean isHardUpdate() {
		return hardUpdate;
	}

	public void setHardUpdate(boolean hardUpdate) {
		this.hardUpdate = hardUpdate;
	}

}
