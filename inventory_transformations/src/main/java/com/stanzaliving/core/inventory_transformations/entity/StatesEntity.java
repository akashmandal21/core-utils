package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "states")
@Entity
@Data
public class StatesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Long id;

    @Column(name = "created_at")
	@JsonProperty("CREATED_AT")
    private Timestamp createdAt;

    @Column(name = "created_by", columnDefinition = "char")
	@JsonProperty("CREATED_BY")
    private String createdBy;

    @Column(name = "status")
	@JsonProperty("STATUS")
    private Boolean status = Boolean.FALSE;

    @Column(name = "updated_at")
	@JsonProperty("UPDATED_AT")
    private Timestamp updatedAt;

    @Column(name = "updated_by", columnDefinition = "char")
	@JsonProperty("UPDATED_BY")
    private String updatedBy;

    @Column(name = "uuid", nullable = false, columnDefinition = "char")
	@JsonProperty("UUID")
    private String uuid;

    @Column(name = "country_id", nullable = false)
	@JsonProperty("COUNTRY_ID")
    private Long countryId;

    @Column(name = "state_name", nullable = false)
	@JsonProperty("STATE_NAME")
    private String stateName;

    @Column(name = "time_zone")
	@JsonProperty("TIME_ZONE")
    private String timeZone;

    
}