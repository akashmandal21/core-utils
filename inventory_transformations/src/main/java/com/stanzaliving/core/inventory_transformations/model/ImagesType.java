package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "IMAGE_TYPE")
public class ImagesType {
	
	@Id()
	@GeneratedValue
	@Column(name="IMAGE_TYPE_ID")
	private int imageTypeId;
	
	@Column(name="IMAGE_TYPE_NAME")
	private String imageTypeName;

	public int getImageTypeId() {
		return imageTypeId;
	}

	public void setImageTypeId(int imageTypeId) {
		this.imageTypeId = imageTypeId;
	}

	public String getImageTypeName() {
		return imageTypeName;
	}

	public void setImageTypeName(String imageTypeName) {
		this.imageTypeName = imageTypeName;
	}	

}
