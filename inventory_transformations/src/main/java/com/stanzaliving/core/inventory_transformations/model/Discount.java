package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DISCOUNT")
public class Discount {

	@Id()
	@Column(name = "DISCOUNT_ID")
	private String discountId;

	@Column(name = "CREATED", nullable = false)
	private Date created = new Date();

	@Column(name = "EXPIRES_ON", nullable = false)
	private Date expiresOn = new Date();

	@Column(name = "FREQUENCY", nullable = false)
	private DiscountFrequency frequency;

	@Column(name = "SPEND_CATEGORY", nullable = false)
	private DiscountSpendsCategory spendsCategory;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DISCOUNT_CATEGORY_ID")
	private DiscountCategory discountCategory;

	@Column(name = "USER_CATEGORY", nullable = false)
	private UserCategory userCategory;

	@Column(name = "VALUE_TYPE", nullable = false)
	private ValueType valueType;

	@Column(name = "MAX_VALUE", nullable = false)
	private double maxValue;

	@Column(name = "STATUS", nullable = false)
	private String status;

	@Column(name = "USED_BY")
	private String usedBy;
	
	@Column(name = "CREATED_BY", nullable = false)
	private String createdBy;

	@OneToOne(mappedBy = "discount", fetch = FetchType.LAZY, optional=true)
	private BookingCommercials bookingCommercials;

	@Column(name = "VALUE_APPLIED")
	private double valueApplied;

	public String getDiscountId() {
		return discountId;
	}

	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getExpiresOn() {
		return expiresOn;
	}

	public void setExpiresOn(Date expiresOn) {
		this.expiresOn = expiresOn;
	}

	public DiscountFrequency getFrequency() {
		return frequency;
	}

	public void setFrequency(DiscountFrequency frequency) {
		this.frequency = frequency;
	}

	public DiscountSpendsCategory getSpendsCategory() {
		return spendsCategory;
	}

	public void setSpendsCategory(DiscountSpendsCategory spendsCategory) {
		this.spendsCategory = spendsCategory;
	}

	public DiscountCategory getDiscountCategory() {
		return discountCategory;
	}

	public void setDiscountCategory(DiscountCategory discountCategory) {
		this.discountCategory = discountCategory;
	}

	public UserCategory getUserCategory() {
		return userCategory;
	}

	public void setUserCategory(UserCategory userCategory) {
		this.userCategory = userCategory;
	}

	public ValueType getValueType() {
		return valueType;
	}

	public void setValueType(ValueType valueType) {
		this.valueType = valueType;
	}

	public double getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(double maxValue) {
		this.maxValue = maxValue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsedBy() {
		return usedBy;
	}

	public void setUsedBy(String usedBy) {
		this.usedBy = usedBy;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public BookingCommercials getBookingCommercials() {
		return bookingCommercials;
	}

	public void setBookingCommercials(BookingCommercials bookingCommercials) {
		this.bookingCommercials = bookingCommercials;
	}

	public double getValueApplied() {
		return valueApplied;
	}

	public void setValueApplied(double valueApplied) {
		this.valueApplied = valueApplied;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((discountCategory == null) ? 0 : discountCategory.hashCode());
		result = prime * result + ((discountId == null) ? 0 : discountId.hashCode());
		result = prime * result + ((expiresOn == null) ? 0 : expiresOn.hashCode());
		result = prime * result + ((frequency == null) ? 0 : frequency.hashCode());
		long temp;
		temp = Double.doubleToLongBits(maxValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((spendsCategory == null) ? 0 : spendsCategory.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((usedBy == null) ? 0 : usedBy.hashCode());
		result = prime * result + ((userCategory == null) ? 0 : userCategory.hashCode());
		temp = Double.doubleToLongBits(valueApplied);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((valueType == null) ? 0 : valueType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Discount))
			return false;
		Discount other = (Discount) obj;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (discountCategory == null) {
			if (other.discountCategory != null)
				return false;
		} else if (!discountCategory.equals(other.discountCategory))
			return false;
		if (discountId == null) {
			if (other.discountId != null)
				return false;
		} else if (!discountId.equals(other.discountId))
			return false;
		if (expiresOn == null) {
			if (other.expiresOn != null)
				return false;
		} else if (!expiresOn.equals(other.expiresOn))
			return false;
		if (frequency != other.frequency)
			return false;
		if (Double.doubleToLongBits(maxValue) != Double.doubleToLongBits(other.maxValue))
			return false;
		if (spendsCategory != other.spendsCategory)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (usedBy == null) {
			if (other.usedBy != null)
				return false;
		} else if (!usedBy.equals(other.usedBy))
			return false;
		if (userCategory != other.userCategory)
			return false;
		if (Double.doubleToLongBits(valueApplied) != Double.doubleToLongBits(other.valueApplied))
			return false;
		if (valueType != other.valueType)
			return false;
		return true;
	}

}
