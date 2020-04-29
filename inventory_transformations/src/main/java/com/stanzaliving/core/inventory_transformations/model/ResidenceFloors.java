package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name="RESIDENCE_FLOORS")
public class ResidenceFloors {
	
	@Id
	@Column(name = "FLOOR")
	private String floor;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "RSIDENCE_ID")
    private Residence residence;

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public Residence getResidence() {
		return residence;
	}

	public void setResidence(Residence residence) {
		this.residence = residence;
	}

}
