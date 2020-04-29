package com.stanzaliving.core.inventory_transformations.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "SERVICE")
public class Service {
	
	@Id
	@GeneratedValue
	@Column(name="SERVICE_ID")
	private int serviceId;
	
	@Column(name="NAME",nullable=false)
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy="service", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<ResidenceService> residenceServices;
	
//	@JsonIgnore
//	@OneToMany(mappedBy="service", fetch=FetchType.LAZY)
//	private Set<RoomService> roomServices;
	
	@Column(name="CREATED", nullable=false)
	private Date created = new Date();
	
	@Column(name="UPDATED", nullable=false)
	private Date updated = new Date();
	
	@Column(name="ENABLED", nullable=false)
	private boolean enabled = true;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public Set<ResidenceService> getResidenceServices() {
		return residenceServices;
	}

	public void setResidenceServices(Set<ResidenceService> residenceServices) {
		this.residenceServices = residenceServices;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (enabled ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + serviceId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Service))
			return false;
		Service other = (Service) obj;
		if (enabled != other.enabled)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (serviceId != other.serviceId)
			return false;
		return true;
	}

//	public Set<RoomService> getRoomServices() {
//		return roomServices;
//	}
//
//	public void setRoomServices(Set<RoomService> roomServices) {
//		this.roomServices = roomServices;
//	}
	
}
