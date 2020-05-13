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
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "UNIQUE_IDENTIFIER")
	@JsonProperty("unique_identifier")
    private String uniqueIdentifier;

    @Column(name = "NAME")
	@JsonProperty("name")
    private String NAME;

    @Column(name = "PAYOUT_MODE_ID")
	@JsonProperty("payout_mode_id")
    private Integer payoutModeId;

    @Column(name = "USER_TYPE")
	@JsonProperty("user_type")
    private Integer userType;

    @Column(name = "USERNAME")
	@JsonProperty("username")
    private String USERNAME;

    @Column(name = "METADATA", columnDefinition = "json")
	@JsonProperty("metadata")
    private String METADATA;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "VERIFIED")
	@JsonProperty("verified")
    private Boolean VERIFIED = Boolean.FALSE;

    @Column(name = "BLOCKED")
	@JsonProperty("blocked")
    private Boolean BLOCKED = Boolean.FALSE;

    
}