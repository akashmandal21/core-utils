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
public class DiscountEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "DISCOUNT_ID", insertable = false, nullable = false)
	@JsonProperty("discount_id")
    private String discountId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "CREATED_BY", nullable = false)
	@JsonProperty("created_by")
    private String createdBy;

    @Column(name = "EXPIRES_ON", nullable = false)
	@JsonProperty("expires_on")
    private Timestamp expiresOn;

    @Column(name = "FREQUENCY", nullable = false)
	@JsonProperty("frequency")
    private Integer FREQUENCY;

    @Column(name = "MAX_VALUE", nullable = false)
	@JsonProperty("max_value")
    private Double maxValue;

    @Column(name = "SPEND_CATEGORY", nullable = false)
	@JsonProperty("spend_category")
    private Integer spendCategory;

    @Column(name = "STATUS", nullable = false)
	@JsonProperty("status")
    private String STATUS;

    @Column(name = "USED_BY")
	@JsonProperty("used_by")
    private String usedBy;

    @Column(name = "USER_CATEGORY", nullable = false)
	@JsonProperty("user_category")
    private Integer userCategory;

    @Column(name = "VALUE_APPLIED")
	@JsonProperty("value_applied")
    private Double valueApplied;

    @Column(name = "VALUE_TYPE", nullable = false)
	@JsonProperty("value_type")
    private Integer valueType;

    @Column(name = "BOOKING_ID")
	@JsonProperty("booking_id")
    private Integer bookingId;

    @Column(name = "DISCOUNT_CATEGORY_ID")
	@JsonProperty("discount_category_id")
    private Integer discountCategoryId;

    @Column(name = "SERVICE_CODE")
	@JsonProperty("service_code")
    private String serviceCode;

    
}