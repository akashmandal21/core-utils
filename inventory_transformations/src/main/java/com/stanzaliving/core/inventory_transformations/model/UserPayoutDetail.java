package com.stanzaliving.core.inventory_transformations.model;

import com.stanzaliving.inventory.converter.JsonToMapConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_PAYOUT_DETAIL")
public class UserPayoutDetail {

	@Id()
	@GeneratedValue
	@Column(name = "ID")
	private int userPayoutDetailId;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "PAYOUT_MODE_ID", nullable = false)
	private Integer payoutModeId;

	@Column(name = "USERNAME", nullable = false)
	private String userName;

	@Column(name = "USER_TYPE", nullable = false)
	private UserType userType;

	@Column(name = "UNIQUE_IDENTIFIER", nullable = true)
	private String uniqueIdentifier;

	@Convert(converter = JsonToMapConverter.class)
	private Map<String, String> metadata;
	
//	@Column(name = "CREATED", nullable = false)
//	private Date created = new Date();
//
//	@Column(name = "UPDATED", nullable = false)
//	private Date updated = new Date();

	@Column(name = "VERIFIED", nullable = false)
	private boolean verified = false;

	@Column(name = "BLOCKED", nullable = false)
	private boolean blocked = false;

}
