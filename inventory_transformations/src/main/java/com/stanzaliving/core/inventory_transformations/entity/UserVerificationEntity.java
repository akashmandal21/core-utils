package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "USER_VERIFICATION")
@Data
@Entity
public class UserVerificationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "UUID", nullable = false)
	@JsonProperty("UUID")
    private String UUID;

    @Column(name = "VISIT")
	@JsonProperty("VISIT")
    private Boolean VISIT;

    @Column(name = "USER_ID")
	@JsonProperty("USER_ID")
    private String userId;

    @Column(name = "USER_TYPE")
	@JsonProperty("USER_TYPE")
    private String userType;

    @Column(name = "USER_NAME")
	@JsonProperty("USER_NAME")
    private String userName;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    
}