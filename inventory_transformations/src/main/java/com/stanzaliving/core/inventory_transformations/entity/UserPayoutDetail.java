package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "USER_PAYOUT_DETAIL")
public class UserPayoutDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "UNIQUE_IDENTIFIER")
    private String uniqueIdentifier;

    @Column(name = "NAME")
    private String NAME;

    @Column(name = "PAYOUT_MODE_ID")
    private Integer payoutModeId;

    @Column(name = "USER_TYPE")
    private Integer userType;

    @Column(name = "USERNAME")
    private String USERNAME;

    @Column(name = "METADATA")
    private String METADATA;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "VERIFIED")
    private Boolean VERIFIED = Boolean.FALSE;

    @Column(name = "BLOCKED")
    private Boolean BLOCKED = Boolean.FALSE;

    
}