package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;


@Entity
@Table(name = "HOSTEL_WIFI")
public class HostelWifi {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
