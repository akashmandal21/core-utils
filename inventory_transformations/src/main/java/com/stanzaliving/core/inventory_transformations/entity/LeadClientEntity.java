package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "LEAD_CLIENT")
@Data
@Entity
public class LeadClientEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLIENT_ID", insertable = false, nullable = false)
	@JsonProperty("CLIENT_ID")
    private Integer clientId;

    @Column(name = "CLIENT_NAME")
	@JsonProperty("CLIENT_NAME")
    private String clientName = "";

    @Column(name = "SALT")
	@JsonProperty("SALT")
    private String SALT;

    
}