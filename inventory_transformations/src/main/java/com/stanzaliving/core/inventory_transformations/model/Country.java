package com.stanzaliving.core.inventory_transformations.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "COUNTRY")
public class Country {
	
	@Id
	@GeneratedValue
	@Column(name="COUNTRY_ID")
	private int countryId;
	
	@Column(name="NAME",nullable=false)
	private String name;
	
	@Column(name="CODE")
	private String code;
	
}
