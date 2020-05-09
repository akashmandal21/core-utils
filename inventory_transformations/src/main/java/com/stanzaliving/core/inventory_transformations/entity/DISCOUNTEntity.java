package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "DISCOUNT")
@Entity
@Data
public class DISCOUNTEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "DISCOUNT_ID", insertable = false, nullable = false)
	@JsonProperty("DISCOUNT_ID")
    private String discountId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "CREATED_BY", nullable = false)
	@JsonProperty("CREATED_BY")
    private String createdBy;

    @Column(name = "EXPIRES_ON", nullable = false)
	@JsonProperty("EXPIRES_ON")
    private Timestamp expiresOn;

    @Column(name = "FREQUENCY", nullable = false)
	@JsonProperty("FREQUENCY")
    private Integer FREQUENCY;

    @Column(name = "MAX_VALUE", nullable = false)
	@JsonProperty("MAX_VALUE")
    private Double maxValue;

    @Column(name = "SPEND_CATEGORY", nullable = false)
	@JsonProperty("SPEND_CATEGORY")
    private Integer spendCategory;

    @Column(name = "STATUS", nullable = false)
	@JsonProperty("STATUS")
    private String STATUS;

    @Column(name = "USED_BY")
	@JsonProperty("USED_BY")
    private String usedBy;

    @Column(name = "USER_CATEGORY", nullable = false)
	@JsonProperty("USER_CATEGORY")
    private Integer userCategory;

    @Column(name = "VALUE_APPLIED")
	@JsonProperty("VALUE_APPLIED")
    private Double valueApplied;

    @Column(name = "VALUE_TYPE", nullable = false)
	@JsonProperty("VALUE_TYPE")
    private Integer valueType;

    @Column(name = "BOOKING_ID")
	@JsonProperty("BOOKING_ID")
    private Integer bookingId;

    @Column(name = "DISCOUNT_CATEGORY_ID")
	@JsonProperty("DISCOUNT_CATEGORY_ID")
    private Integer discountCategoryId;

    @Column(name = "SERVICE_CODE")
	@JsonProperty("SERVICE_CODE")
    private String serviceCode;

    
}