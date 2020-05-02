package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "USER_ROLES")
@Entity
@Data
public class UserRoles implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "USERNAME", nullable = false)
    private String USERNAME;

    @Column(name = "ROLE")
    private String ROLE;

    @Column(name = "USER_ID")
    private Integer userId;

    
}