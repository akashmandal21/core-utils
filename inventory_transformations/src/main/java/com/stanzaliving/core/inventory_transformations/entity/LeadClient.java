package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "LEAD_CLIENT")
@Entity
public class LeadClient implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLIENT_ID", insertable = false, nullable = false)
    private Integer clientId;

    @Column(name = "CLIENT_NAME")
    private String clientName = "";

    @Column(name = "SALT")
    private String SALT;

    
}