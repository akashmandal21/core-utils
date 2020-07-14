package com.stanzaliving.dashboard.dto;

import com.stanzaliving.dashboard.enums.FeElementType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FeElementDto {

	private FeElementType type;

	private Object value;

	private boolean isHover = false;

	private int numerator;

	private int denominator;

	private String bgColorCode = "";

	public FeElementDto(int value) {
		this.value = value;
		this.type = FeElementType.INTEGER;
	}

	public FeElementDto(double value) {
		this(value, FeElementType.DOUBLE);
	}

	public FeElementDto(double value, FeElementType feElementType) {
		this.value = value;
		this.type = feElementType;
	}

	public FeElementDto(int numerator, int denominator) {
		this(numerator, denominator, FeElementType.PERCENT_DOUBLE);
	}

	public FeElementDto(int numerator, int denominator, FeElementType feElementType) {
		this.numerator = numerator;
		this.denominator = denominator;
		this.value = denominator != 0 ? (double) (numerator * 100) / (double) denominator : 0;
		this.isHover = true;
		this.type = feElementType;
	}

	public FeElementDto(double numerator, double denominator) {
		this.numerator = (int) numerator;
		this.denominator = (int) denominator;
		this.value = denominator != 0 ? (numerator * 100) / denominator : 0;
		this.isHover = true;
		this.type = FeElementType.PERCENT_DOUBLE;
	}

	public FeElementDto(double numerator, double denominator, FeElementType feElementType) {
		this.numerator = (int) numerator;
		this.denominator = (int) denominator;
		this.value = denominator != 0 ? (numerator * 100) / denominator : 0;
		this.isHover = true;
		this.type = feElementType;
	}

	public FeElementDto(int numerator, int denominator, boolean isHover) {
		this.numerator = numerator;
		this.denominator = denominator;
		this.value = denominator != 0 ? (double) (numerator * 100) / (double) denominator : 0;
		this.isHover = isHover;
		this.type = FeElementType.PERCENT_DOUBLE;
	}

	public FeElementDto(double numerator, double denominator, boolean isHover) {
		this.numerator = (int) numerator;
		this.denominator = (int) denominator;
		this.value = denominator != 0 ? (double) (numerator * 100) / (double) denominator : 0;
		this.isHover = isHover;
		this.type = FeElementType.PERCENT_DOUBLE;
	}

	public FeElementDto(String value) {
		this.value = value;
		this.type = FeElementType.STRING;
	}

	public FeElementDto(int numerator, int denominator, boolean isHover, FeElementType feElementType) {
		this.value = denominator != 0 ? (double) numerator / (double) denominator : 0;
		this.numerator = numerator;
		this.denominator = denominator;
		this.isHover = isHover;
		this.type = feElementType;
	}

	public FeElementDto(double numerator, double denominator, boolean isHover, FeElementType feElementType) {
		this.value = denominator != 0 ? numerator / denominator : 0;
		this.numerator = (int) numerator;
		this.denominator = (int) denominator;
		this.isHover = isHover;
		this.type = feElementType;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}