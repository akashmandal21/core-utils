package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "DISCOUNT_CATEGORY")
public class DiscountCategory {

	@Id()
	@GeneratedValue
	@Column(name = "DISCOUNT_CATEGORY_ID")
	private int discountCategoryId;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "SHORTHAND", nullable = false)
	private String shorthand;

	public int getDiscountCategoryId() {
		return discountCategoryId;
	}

	public void setDiscountCategoryId(int discountCategoryId) {
		this.discountCategoryId = discountCategoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShorthand() {
		return shorthand;
	}

	public void setShorthand(String shorthand) {
		this.shorthand = shorthand;
	}

}
