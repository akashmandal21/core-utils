package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "RESIDENCE_RC")
public class ResidenceRc implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "RESIDENCE_RC_ID", nullable = false)
    private Integer residenceRcId;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "NAME", nullable = false)
    private String NAME;

    @Column(name = "PAYMONK_SENDER_ID", nullable = false)
    private String paymonkSenderId;

    @Column(name = "PHONE", nullable = false)
    private String PHONE;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    
}