package com.stanzaliving.core.base.utils;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class NumberUtils {

    public String getOrdinalNumber(Integer n) {
        String suffix;
        switch (n % 10) {
            case 1:
                suffix = "st";
                break;
            case 2:
                suffix = "nd";
                break;
            case 3:
                suffix = "rd";
                break;
            default:
                suffix = "th";
        }
        if (n >= 11 && n <= 13) {
            suffix = "th";
        }
        return n.toString() + suffix;
    }

    public boolean parsableToLong(String number) {
        if (StringUtils.isEmpty(number)) {
            return false;
        }
        try {
            Long.parseLong(number);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public boolean parsableToInteger(String number) {
        if (StringUtils.isEmpty(number)) {
            return false;
        }
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public boolean parseableToDouble(String number) {
        if (StringUtils.isEmpty(number)) {
            return false;
        }
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static List<Object> convertBigIntegerAndBigDecimal(Object[] record) {
        List<Object> updatedRecord = new ArrayList<>(record.length);
        Object updatedObject;

        for (Object object : record) {
            updatedObject = (null == object) ? object : object instanceof BigDecimal ? ((BigDecimal) object).doubleValue()
                    : object instanceof BigInteger ? ((BigInteger) object).intValue() : object;
            updatedRecord.add(updatedObject);
        }
        return updatedRecord;
    }

}
