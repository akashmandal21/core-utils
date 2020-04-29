package com.stanzaliving.core.inventory_transformations.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "RESIDENCE_POS_CODE")
public class ResidencePosCode {

	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "CREATED_AT")
	private Date createdAt;

	@Column(name = "RESIDENCE_ID")
	private Integer residenceId;

	@Column(name = "PINE_LAB_POS_CODE")
	private String pineLabPosCode;
	
	@Column(name = "PINE_LAB_IMEI")
	private String pineLabImei;

}
