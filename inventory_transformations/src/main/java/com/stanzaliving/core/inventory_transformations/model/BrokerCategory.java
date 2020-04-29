package com.stanzaliving.core.inventory_transformations.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "BROKER_CATEGORY")
public class BrokerCategory {
	
	@Id()
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME",nullable=false)
	private String name;

	@OneToMany(mappedBy="brokerCategoryId", cascade= {CascadeType.ALL}, fetch=FetchType.LAZY)
	private Set<BrokerType> brokerType = new HashSet<>(0);
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<BrokerType> getBrokerType() {
		return brokerType;
	}

	public void setBrokerType(Set<BrokerType> brokerType) {
		this.brokerType = brokerType;
	}
	
	
}
