package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DISCOUNT_CATEGORY")
@Data
public class DiscountCategory implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DISCOUNT_CATEGORY_ID", insertable = false, nullable = false)
    private Integer discountCategoryId;

    @Column(name = "NAME", nullable = false)
    private String NAME;

    @Column(name = "SHORTHAND", nullable = false)
    private String SHORTHAND;

    
}