package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "PERMISSIONS")
@Entity
public class PERMISSIONS implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PERMISSIONS_ID", insertable = false, nullable = false)
    private Integer permissionsId;

    @Column(name = "PERMISSION_NAME", nullable = false)
    private String permissionName;

    
}