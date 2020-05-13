package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
//@Entity
@Table(name = "USER_ROLES")
public class UserRolesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "USERNAME", nullable = false)
	@JsonProperty("username")
    private String USERNAME;

    @Column(name = "ROLE")
	@JsonProperty("role")
    private String ROLE;

    @Column(name = "USER_ID")
	@JsonProperty("user_id")
    private Integer userId;

    
}