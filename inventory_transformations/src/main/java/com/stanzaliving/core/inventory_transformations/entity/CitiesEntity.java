package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Table(name = "cities")
@Entity
public class CitiesEntity implements Serializable {
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

    @Column(name = "city_name", nullable = false)
	@JsonProperty("city_name")
    private String cityName;

    @Column(name = "latitude", nullable = false)
	@JsonProperty("latitude")
    private BigDecimal latitude;

    @Column(name = "longitude", nullable = false)
	@JsonProperty("longitude")
    private BigDecimal longitude;

    @Column(name = "polygon", columnDefinition = "text")
	@JsonProperty("polygon")
    private String polygon;

    @Column(name = "state_id", nullable = false)
	@JsonProperty("state_id")
    private Long stateId;

    @Column(name = "city_code")
	@JsonProperty("city_code")
    private String cityCode;

    @Column(name = "target_beds")
	@JsonProperty("target_beds")
    private Integer targetBeds;

    @Column(name = "target_rooms")
	@JsonProperty("target_rooms")
    private Integer targetRooms;

    @Column(name = "core_city_id")
	@JsonProperty("core_city_id")
    private Integer coreCityId;

    @Column(name = "core_city_name")
	@JsonProperty("core_city_name")
    private String coreCityName;

    
}