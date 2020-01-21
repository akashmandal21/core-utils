package com.stanzaliving.core.operations.dto.response.report;

import com.stanzaliving.core.operations.enums.FeElementType;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FeElementDto {

    FeElementType type;

    double value;

    boolean isHover = false;

    int numerator;

    int denominator;

    String bgColorCode = "";

    public FeElementDto(int value) {
        this.value = value;
        this.type = FeElementType.INTEGER;
    }

    public FeElementDto(double value) {
        this.value = value;
        this.type = FeElementType.DOUBLE;
    }

    public FeElementDto(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.value = denominator != 0 ? (double) (numerator*100) / (double) denominator : 0;
        this.isHover = true;
        this.type = FeElementType.PERCENT_DOUBLE;
    }
    
    public FeElementDto(double numerator, double denominator) {
        this.numerator = (int)numerator;
        this.denominator = (int)denominator;
        this.value = denominator != 0 ? (numerator*100) / denominator : 0;
        this.isHover = true;
        this.type = FeElementType.PERCENT_DOUBLE;
    }

    public FeElementDto(int numerator, int denominator, boolean isHover) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.value = denominator != 0 ? (double) (numerator*100) / (double) denominator : 0;
        this.isHover = isHover;
        this.type = FeElementType.PERCENT_DOUBLE;
    }
    
    //should be used for fraction display
    public FeElementDto(int numerator, int denominator, boolean isHover, FeElementType feElementType) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.isHover = isHover;
        this.type = feElementType;
    }


}

