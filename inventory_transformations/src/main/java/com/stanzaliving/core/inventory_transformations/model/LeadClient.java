package com.stanzaliving.core.inventory_transformations.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LEAD_CLIENT")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeadClient {
	
	@Id
	@Column(name = "CLIENT_ID")
	public Integer clientId;

	@Column(name = "CLIENT_NAME")
	private String clientName;

	@Column(name = "SALT")
	private String salt;

}
