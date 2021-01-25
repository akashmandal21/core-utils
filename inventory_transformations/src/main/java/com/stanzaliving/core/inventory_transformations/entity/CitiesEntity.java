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

    @Column(name = "city_name", nullable = false)
	@JsonProperty("CITY_NAME")
    private String cityName;

    @Column(name = "latitude", nullable = false)
	@JsonProperty("LATITUDE")
    private BigDecimal latitude;

    @Column(name = "longitude", nullable = false)
	@JsonProperty("LONGITUDE")
    private BigDecimal longitude;

    @Column(name = "polygon", columnDefinition = "text")
	@JsonProperty("POLYGON")
    private String polygon;

    @Column(name = "state_id", nullable = false)
	@JsonProperty("STATE_ID")
    private Long stateId;

    @Column(name = "city_code")
	@JsonProperty("CITY_CODE")
    private String cityCode;

    @Column(name = "target_beds")
	@JsonProperty("TARGET_BEDS")
    private Integer targetBeds;

    @Column(name = "target_rooms")
	@JsonProperty("TARGET_ROOMS")
    private Integer targetRooms;

    @Column(name = "core_city_id")
	@JsonProperty("CORE_CITY_ID")
    private Integer coreCityId;

    @Column(name = "core_city_name")
	@JsonProperty("CORE_CITY_NAME")
    private String coreCityName;

    
}