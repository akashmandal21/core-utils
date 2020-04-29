package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ATTRIBUTE")
public class Attribute {
	
	@Id
	@GeneratedValue
	@Column(name="ATTRIBUTE_ID")
	private int attributeId;
	
	@Column(name="NAME",nullable=false, unique=true)
	private String name;
	
	@OneToMany(mappedBy="attribute", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<ResidenceAttribute> residenceAttributes = new HashSet<>();
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "attributes")
	private Set<Room> rooms = new HashSet<>(0);
	
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

	public int getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	public Set<ResidenceAttribute> getResidenceAttributes() {
		return residenceAttributes;
	}

	public void setResidenceAttributes(Set<ResidenceAttribute> residenceAttributes) {
		this.residenceAttributes = residenceAttributes;
	}

	public Set<Room> getRooms() {
		return rooms;
	}

	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attributeId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Attribute))
			return false;
		Attribute other = (Attribute) obj;
		if (attributeId != other.attributeId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
