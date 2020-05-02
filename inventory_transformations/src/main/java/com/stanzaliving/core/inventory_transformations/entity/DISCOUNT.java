package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "DISCOUNT")
public class DISCOUNT implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "DISCOUNT_ID", insertable = false, nullable = false)
    private String discountId;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "CREATED_BY", nullable = false)
    private String createdBy;

    @Column(name = "EXPIRES_ON", nullable = false)
    private LocalDateTime expiresOn;

    @Column(name = "FREQUENCY", nullable = false)
    private Integer FREQUENCY;

    @Column(name = "MAX_VALUE", nullable = false)
    private Double maxValue;

    @Column(name = "SPEND_CATEGORY", nullable = false)
    private Integer spendCategory;

    @Column(name = "STATUS", nullable = false)
    private String STATUS;

    @Column(name = "USED_BY")
    private String usedBy;

    @Column(name = "USER_CATEGORY", nullable = false)
    private Integer userCategory;

    @Column(name = "VALUE_APPLIED")
    private Double valueApplied;

    @Column(name = "VALUE_TYPE", nullable = false)
    private Integer valueType;

    @Column(name = "BOOKING_ID")
    private Integer bookingId;

    @Column(name = "DISCOUNT_CATEGORY_ID")
    private Integer discountCategoryId;

    
}