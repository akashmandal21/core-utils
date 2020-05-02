package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "APP_VERSION")
@Entity
@Data
public class AppVersion implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "APP_VERSION_ID", nullable = false)
    private Integer appVersionId;

    @Column(name = "HARD_UPDATE", nullable = false)
    private Boolean hardUpdate;

    @Column(name = "VERSION", nullable = false)
    private String VERSION;

    
}