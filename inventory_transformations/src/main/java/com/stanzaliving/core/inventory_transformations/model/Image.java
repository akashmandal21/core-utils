package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "IMAGE")
public class Image {

	@Id
	@GeneratedValue
	@Column(name = "IMAGE_ID")
	private int imageId;

	@Column(name = "IMAGE_URL")
	private String imageUrl;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ROOM_ID")
	private Room room;

	@Column(name = "CREATED", nullable = false)
	private Date created = new Date();

	@Column(name = "UPDATED", nullable = false)
	private Date updated = new Date();	

	@Column(name = "ENABLED")
	private boolean enabled = true;
	
	@Column(name = "IMAGE_TYPE_ID")
	private int imageTypeId;
	
	public int getImageTypeId() {
		return imageTypeId;
	}

	public void setImageTypeId(int imageTypeId) {
		this.imageTypeId = imageTypeId;
	}


	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + imageId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Image other = (Image) obj;
		if (imageId != other.imageId)
			return false;
		return true;
	}
}
