package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "ROLES_RESIDENCE_MAPPING")
public class RolesResidenceMapping implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLE_MAPPING_ID", insertable = false, nullable = false)
    private Integer roleMappingId;

    @Column(name = "ROLE_NAME", nullable = false)
    private String roleName;

    @Column(name = "RESIDENCE_ID", nullable = false)
    private Integer residenceId;

    
}