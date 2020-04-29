package com.stanzaliving.core.inventory_transformations.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PAYOUT_MODE")
public class PayoutMode {

	@Id()
	@GeneratedValue
	@Column(name = "PAYOUT_MODE_ID")
	private int payoutModeId;

	@Column(name = "NAME", nullable = false)
	private String name;

	@JsonIgnore
	@Column(name = "CREATED", nullable = false)
	private Date created = new Date();

	@JsonIgnore
	@Column(name = "UPDATED", nullable = false)
	private Date updated = new Date();

	@JsonIgnore
	@Column(name = "ENABLED", nullable = false)
	private boolean enabled = true;
}
