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
	@JsonProperty("id")
    private Long id;

    @Column(name = "created_at")
	@JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(name = "created_by", columnDefinition = "char")
	@JsonProperty("created_by")
    private String createdBy;

    @Column(name = "status")
	@JsonProperty("status")
    private Boolean status = Boolean.FALSE;

    @Column(name = "updated_at")
	@JsonProperty("updated_at")
    private Timestamp updatedAt;

    @Column(name = "updated_by", columnDefinition = "char")
	@JsonProperty("updated_by")
    private String updatedBy;

    @Column(name = "uuid", nullable = false, columnDefinition = "char")
	@JsonProperty("uuid")
    private String uuid;

    @Column(name = "country_id", nullable = false)
	@JsonProperty("country_id")
    private Long countryId;

    @Column(name = "state_name", nullable = false)
	@JsonProperty("state_name")
    private String stateName;

    @Column(name = "time_zone")
	@JsonProperty("time_zone")
    private String timeZone;

    
}