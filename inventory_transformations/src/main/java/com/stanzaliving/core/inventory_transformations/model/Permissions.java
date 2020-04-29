package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "PERMISSIONS")
public class Permissions {
	
	@Id
	@GeneratedValue
	@Column(name="PERMISSIONS_ID")
	private int permissionsId;
	
	@Column(name="PERMISSION_NAME",nullable=false)
	private String permissionName;

	public int getPermissionsId() {
		return permissionsId;
	}

	public void setPermissionsId(int permissionsId) {
		this.permissionsId = permissionsId;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	
	
	
}
