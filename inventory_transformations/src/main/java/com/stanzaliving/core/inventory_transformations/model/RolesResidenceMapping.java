package com.stanzaliving.core.inventory_transformations.model;


import javax.persistence.*;

@Entity
@Table(name = "ROLES_RESIDENCE_MAPPING")
//uniqueConstraints = { @UniqueConstraint( columnNames = { "ROLE_NAME", "RESIDENCE_ID"})})
public class RolesResidenceMapping {
	
	@Id
	@GeneratedValue
	@Column(name = "ROLE_MAPPING_ID", nullable = false)
	private int roleMappingId;
	
	@Column(name = "ROLE_NAME", nullable = false)
	private String roleName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RESIDENCE_ID", nullable = false)
	private Residence residence;

	public int getRoleMappingId() {
		return roleMappingId;
	}

	public void setRoleMappingId(int roleMappingId) {
		this.roleMappingId = roleMappingId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Residence getResidence() {
		return residence;
	}

	public void setResidence(Residence residence) {
		this.residence = residence;
	}
	
}
