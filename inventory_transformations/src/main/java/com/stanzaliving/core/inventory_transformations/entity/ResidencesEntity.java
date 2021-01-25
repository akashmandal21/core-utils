package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "residences")
public class ResidencesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Long id;

    @Column(name = "uuid", nullable = false, columnDefinition = "char")
	@JsonProperty("UUID")
    private String uuid;

    @Column(name = "residence_name", nullable = false)
	@JsonProperty("RESIDENCE_NAME")
    private String residenceName;

    @Column(name = "micromarket_id", nullable = false, columnDefinition = "char")
	@JsonProperty("MICROMARKET_ID")
    private String micromarketId;

    @Column(name = "residence_type", nullable = false)
	@JsonProperty("RESIDENCE_TYPE")
    private String residenceType;

    @Column(name = "brand_name", nullable = false)
	@JsonProperty("BRAND_NAME")
    private String brandName;

    @Column(name = "bed_count", nullable = false)
	@JsonProperty("BED_COUNT")
    private Integer bedCount = 0;

    @Column(name = "room_count", nullable = false)
	@JsonProperty("ROOM_COUNT")
    private Integer roomCount = 0;

    @Column(name = "estate_gender", nullable = false)
	@JsonProperty("ESTATE_GENDER")
    private String estateGender;

    @Column(name = "core_residence_id")
	@JsonProperty("CORE_RESIDENCE_ID")
    private Integer coreResidenceId;

    @Column(name = "core_residence_name")
	@JsonProperty("CORE_RESIDENCE_NAME")
    private String coreResidenceName;

    @Column(name = "status")
	@JsonProperty("STATUS")
    private Boolean status = Boolean.FALSE;

    @Column(name = "created_at")
	@JsonProperty("CREATED_AT")
    private Timestamp createdAt;

    @Column(name = "created_by", columnDefinition = "char")
	@JsonProperty("CREATED_BY")
    private String createdBy;

    @Column(name = "updated_at")
	@JsonProperty("UPDATED_AT")
    private Timestamp updatedAt;

    @Column(name = "updated_by", columnDefinition = "char")
	@JsonProperty("UPDATED_BY")
    private String updatedBy;

    
}