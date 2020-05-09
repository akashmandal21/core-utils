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
	@JsonProperty("id")
    private Long id;

    @Column(name = "uuid", nullable = false, columnDefinition = "char")
	@JsonProperty("uuid")
    private String uuid;

    @Column(name = "residence_name", nullable = false)
	@JsonProperty("residence_name")
    private String residenceName;

    @Column(name = "micromarket_id", nullable = false, columnDefinition = "char")
	@JsonProperty("micromarket_id")
    private String micromarketId;

    @Column(name = "residence_type", nullable = false)
	@JsonProperty("residence_type")
    private String residenceType;

    @Column(name = "brand_name", nullable = false)
	@JsonProperty("brand_name")
    private String brandName;

    @Column(name = "bed_count", nullable = false)
	@JsonProperty("bed_count")
    private Integer bedCount = 0;

    @Column(name = "room_count", nullable = false)
	@JsonProperty("room_count")
    private Integer roomCount = 0;

    @Column(name = "estate_gender", nullable = false)
	@JsonProperty("estate_gender")
    private String estateGender;

    @Column(name = "core_residence_id")
	@JsonProperty("core_residence_id")
    private Integer coreResidenceId;

    @Column(name = "core_residence_name")
	@JsonProperty("core_residence_name")
    private String coreResidenceName;

    @Column(name = "status")
	@JsonProperty("status")
    private Boolean status = Boolean.FALSE;

    @Column(name = "created_at")
	@JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(name = "created_by", columnDefinition = "char")
	@JsonProperty("created_by")
    private String createdBy;

    @Column(name = "updated_at")
	@JsonProperty("updated_at")
    private Timestamp updatedAt;

    @Column(name = "updated_by", columnDefinition = "char")
	@JsonProperty("updated_by")
    private String updatedBy;

    
}