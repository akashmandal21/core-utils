package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "BROKER_TYPE")
public class BrokerType {
	
	@Id()
	@GeneratedValue
	@Column(name="ID")
	private int id;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="BROKER_CATEGORY_ID")
	private BrokerCategory brokerCategoryId;
	
	@OneToMany(mappedBy="brokerType", cascade= {CascadeType.ALL}, fetch=FetchType.LAZY)
	private Set<Broker> brokers = new HashSet<>(0);
	
	@Column(name="NAME",nullable=false)
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BrokerCategory getBrokerCategoryId() {
		return brokerCategoryId;
	}

	public void setBrokerCategoryId(BrokerCategory brokerCategoryId) {
		this.brokerCategoryId = brokerCategoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Broker> getBrokers() {
		return brokers;
	}

	public void setBrokers(Set<Broker> brokers) {
		this.brokers = brokers;
	}
	
	
}
