package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "ROLES_PERMISSION_MAPPING")
public class RolesPermissionMapping {

	@Id
	@GeneratedValue
	@Column(name = "ROLE_PERMISSION_ID")
	private int rolePermissionId;

	@Column(name = "ROLE_NAME", nullable = false)
	private String roleName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PERMISSIONS_ID", nullable = false)
	private Permissions perm;

	public int getRolePermissionId() {
		return rolePermissionId;
	}

	public void setRolePermissionId(int rolePermissionId) {
		this.rolePermissionId = rolePermissionId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Permissions getPerm() {
		return perm;
	}

	public void setPerm(Permissions perm) {
		this.perm = perm;
	}

}
