package com.stanzaliving.core.inventory_transformations.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "USER_VERIFICATION")
public class UserVerification {

	@Id
	@Column(name = "UUID", nullable = false)
	private String uuid;

	@Column(name = "VISIT", nullable = true)
	private Boolean visit;

    @Column(name = "USER_ID", nullable = true)
	private String userId;
	
    @Column(name="USER_TYPE", nullable = true)
	private String userType;
	
    @Column(name="USER_NAME", nullable = true)
	private String userName;
    
}
