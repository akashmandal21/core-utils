package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "RESIDENCE_CONTRACT_TYPE")
public class ResidenceContractType {
	
	@Id
	@GeneratedValue
	@Column(name = "RESIDENCE_CONTRACT_TYPE_ID")
	private int residenceContractTypeId;
	
//	@ManyToOne(fetch = FetchType.EAGER)
//	@Join
	@Column(name="RESIDENCE_ID")
	private int residenceId;
	
//	@ManyToOne(fetch = FetchType.EAGER)
//	@Join
	@Column(name="CONTRACT_ID")
	private int contract;
	
	@Column(name="TYPE")
	private UserType type;
	
	@Column(name = "IS_ACTIVE")
	private Boolean isActive = true;
	
	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public int getResidenceContractTypeId() {
		return residenceContractTypeId;
	}

	public void setResidenceContractTypeId(int residenceContractTypeId) {
		this.residenceContractTypeId = residenceContractTypeId;
	}

	public int getResidenceId() {
		return residenceId;
	}

	public void setResidenceId(int residenceId) {
		this.residenceId = residenceId;
	}

	public int getContract() {
		return contract;
	}

	public void setContract(int contract) {
		this.contract = contract;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

}
