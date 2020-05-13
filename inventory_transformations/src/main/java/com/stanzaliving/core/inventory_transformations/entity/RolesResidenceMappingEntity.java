package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "ROLES_RESIDENCE_MAPPING")
public class RolesResidenceMappingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLE_MAPPING_ID", insertable = false, nullable = false)
	@JsonProperty("role_mapping_id")
    private Integer roleMappingId;

    @Column(name = "ROLE_NAME", nullable = false)
	@JsonProperty("role_name")
    private String roleName;

    @Column(name = "RESIDENCE_ID", nullable = false)
	@JsonProperty("residence_id")
    private Integer residenceId;

    
}