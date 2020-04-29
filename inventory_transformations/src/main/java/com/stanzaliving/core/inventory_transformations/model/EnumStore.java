package com.stanzaliving.core.inventory_transformations.model;

@Entity
@Table(name = "ENUM_STORE")
public class EnumStore {

	@Id
	@Column(name="ENUM_KEY")
	private String enumKey;
	
	@Column(name="ENUM_VALUE", nullable = false, columnDefinition = "TEXT")
	private String enumValue;

	public String getEnumKey() {
		return enumKey;
	}

	public void setEnumKey(String enumKey) {
		this.enumKey = enumKey;
	}

	public String getEnumValue() {
		return enumValue;
	}

	public void setEnumValue(String enumValue) {
		this.enumValue = enumValue;
	}

	@Override
	public String toString() {
		return "EnumStore{" +
				"enumKey='" + enumKey + '\'' +
				", enumValue='" + enumValue + '\'' +
				'}';
	}
}
