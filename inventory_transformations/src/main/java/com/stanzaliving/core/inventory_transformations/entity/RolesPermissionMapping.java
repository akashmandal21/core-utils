package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ROLES_PERMISSION_MAPPING")
@Data
public class RolesPermissionMapping implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "ROLE_PERMISSION_ID", nullable = false)
    private Integer rolePermissionId;

    @Column(name = "ROLE_NAME", nullable = false)
    private String roleName;

    @Column(name = "PERMISSIONS_ID", nullable = false)
    private Integer permissionsId;

    
}