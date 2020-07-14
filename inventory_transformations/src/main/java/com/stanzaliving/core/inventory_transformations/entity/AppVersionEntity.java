package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "APP_VERSION")
@Entity
public class AppVersionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "APP_VERSION_ID", nullable = false)
	@JsonProperty("APP_VERSION_ID")
    private Integer appVersionId;

    @Column(name = "HARD_UPDATE", nullable = false)
	@JsonProperty("HARD_UPDATE")
    private Boolean hardUpdate;

    @Column(name = "VERSION", nullable = false)
	@JsonProperty("VERSION")
    private String VERSION;

    
}