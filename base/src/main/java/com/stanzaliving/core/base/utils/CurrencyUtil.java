package com.stanzaliving.core.base.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

public class CurrencyUtil {

    public static final Double DEFAULT_USD_TO_INR_RATE = 75d;

    public static String getRupeeSignAndCommaSeparatedAmount(Double amount){
        Locale locale = new Locale("en","IN");
        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance(locale);
        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance(locale);
        dfs.setCurrencySymbol("\u20B9");
        decimalFormat.setDecimalFormatSymbols(dfs);
        return decimalFormat.format(Math.round(amount * 100D) / 100D).replaceAll("\\.00", "");
    }

    public static String getRoundOffAndRupeeSignAndCommaSeparatedAmount(Double amount, int places){
        Double roundOffAmount = StanzaUtils.roundToPlaces(amount , places);
        Locale locale = new Locale("en","IN");
        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance(locale);
        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance(locale);
        dfs.setCurrencySymbol("\u20B9");
        decimalFormat.setDecimalFormatSymbols(dfs);
        return decimalFormat.format(Math.round(roundOffAmount * 100D) / 100D).replaceAll("\\.00", "");
    }
    
    public static String removeRupeeSignAndComma(String value) {
    	String amount = StringUtils.remove(value, "₹"); 
    	return StringUtils.remove(amount, ",");
    }

    public static Double removeRupeeSignAndCommaAndConvertToDouble(String value) {
    	String amount = StringUtils.remove(value, "₹"); 
    	return Double.parseDouble(StringUtils.remove(amount, ","));
    }
}
