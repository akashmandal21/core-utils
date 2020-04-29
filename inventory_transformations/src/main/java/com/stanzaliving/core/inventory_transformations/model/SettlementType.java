package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name ="SETTLEMENT_TYPE")
public class SettlementType {
	
	@Id
	@GeneratedValue
	@Column(name="SETTLEMENT_TYPE_ID")
	private int id;
	
	@Column(name="SETTLEMENT_TYPE_NAME")
	private String settlementName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSettlementName() {
		return settlementName;
	}

	public void setSettlementName(String settlementName) {
		this.settlementName = settlementName;
	}
	
}
