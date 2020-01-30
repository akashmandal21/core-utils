package com.stanzaliving.core.base.utils;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;

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

}
