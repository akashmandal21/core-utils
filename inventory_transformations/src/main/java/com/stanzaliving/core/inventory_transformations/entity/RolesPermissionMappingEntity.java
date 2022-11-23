package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "ROLES_PERMISSION_MAPPING")
public class RolesPermissionMappingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "ROLE_PERMISSION_ID", nullable = false)
	@JsonProperty("ROLE_PERMISSION_ID")
    private Integer rolePermissionId;

    @Column(name = "ROLE_NAME", nullable = false)
	@JsonProperty("ROLE_NAME")
    private String roleName;

    @Column(name = "PERMISSIONS_ID", nullable = false)
	@JsonProperty("PERMISSIONS_ID")
    private Integer permissionsId;

    
}