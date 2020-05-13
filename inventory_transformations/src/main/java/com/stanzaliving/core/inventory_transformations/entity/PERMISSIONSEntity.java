package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "PERMISSIONS")
@Entity
public class PermissionsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PERMISSIONS_ID", insertable = false, nullable = false)
	@JsonProperty("permissions_id")
    private Integer permissionsId;

    @Column(name = "PERMISSION_NAME", nullable = false)
	@JsonProperty("permission_name")
    private String permissionName;

    
}