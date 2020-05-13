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
	@JsonProperty("client_id")
    private Integer clientId;

    @Column(name = "CLIENT_NAME")
	@JsonProperty("client_name")
    private String clientName = "";

    @Column(name = "SALT")
	@JsonProperty("salt")
    private String SALT;

    
}