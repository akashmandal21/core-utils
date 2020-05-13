package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "DISCOUNT_CATEGORY")
public class DiscountCategoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DISCOUNT_CATEGORY_ID", insertable = false, nullable = false)
	@JsonProperty("discount_category_id")
    private Integer discountCategoryId;

    @Column(name = "NAME", nullable = false)
	@JsonProperty("name")
    private String NAME;

    @Column(name = "SHORTHAND", nullable = false)
	@JsonProperty("shorthand")
    private String SHORTHAND;

    
}