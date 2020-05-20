package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Table(name = "USER_PAYOUT_DETAIL")
@Entity
public class UserPayoutDetailEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "UNIQUE_IDENTIFIER")
	@JsonProperty("UNIQUE_IDENTIFIER")
    private String uniqueIdentifier;

    @Column(name = "NAME")
	@JsonProperty("NAME")
    private String NAME;

    @Column(name = "PAYOUT_MODE_ID")
	@JsonProperty("PAYOUT_MODE_ID")
    private Integer payoutModeId;

    @Column(name = "USER_TYPE")
	@JsonProperty("USER_TYPE")
    private Integer userType;

    @Column(name = "USERNAME")
	@JsonProperty("USERNAME")
    private String USERNAME;

    @Column(name = "METADATA", columnDefinition = "json")
	@JsonProperty("METADATA")
    private String METADATA;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "VERIFIED")
	@JsonProperty("VERIFIED")
    private Boolean VERIFIED = Boolean.FALSE;

    @Column(name = "BLOCKED")
	@JsonProperty("BLOCKED")
    private Boolean BLOCKED = Boolean.FALSE;

    
}