/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.constants;

import java.math.BigDecimal;

/**
 * @author nipunaggarwal
 *
 */
public class Constants {

	public static final String SERVICE_NAME = "OpsCalculatorService";

	public static final int DAYS_IN_YEAR = 365;
	public static final int MONTHS = 12;

	public static final String RUPEE_SYMBOL = "(\u20B9)";
	public static final String DECIMAL_FORMAT_TWO_PLACES = "#.##";

	public static final String MERGED_STATUS="MERGED";
	public static final String CLOSED_STATUS="CLOSED";

	public static final double DEFUALT_OCCUPANCY = 0.9;
	public static final double MINIMUM_OCCUPANCY = 0.75;

	public static final int DEFUALT_OCCUPANCY_PERCENT = 90;

	public static final double LOAD_FOR_AC_ROOMS = 1.80;
	public static final double LOAD_FOR_NON_AC_ROOMS = 0.45;
	
	public static final int HK_RATE_NUMERATOR_VALUE = 30;
	public static final int HK_RATE_DENOMINATOR_VALUE = 26;
	
	public static final int ELECTRICITY_ROOM_METER_OPEX_COST_PER_MONTH = 70;

	public static final double MARGIN_HK = 0.10;
	public static final double GST_HK = 0.18;
	public static final double MARGIN_LAUNDRY = 0.10;
	public static final double GST_LAUNDRY = 0.18;
	public static final double MARGIN_RC = 0.10;
	public static final double GST_RC = 0.18;
	public static final double MARGIN_OE = 0.10;
	public static final double GST_OE = 0.18;
	public static final double MARGIN_SECURITY = 0.10;
	public static final double GST_SECURITY = 0.18;
	public static final double MARGIN_SUBSCRIPTION_SUPPLIES = 0.10;
	public static final double GST_SUBSCRIPTION_SUPPLIES = 0.18;
	public static final double MARGIN_REPAIR_MAINTENANCE = 0.10;
	public static final double GST_REPAIR_MAINTENANCE = 0.18;
	public static final double MARGIN_FOOD_STANZA_KITCHEN = 0.30;
	public static final double GST_FOOD_STANZA_KITCHEN = 0.05;
	public static final double MARGIN_FOOD_VENDOR = 0.10;
	public static final double GST_FOOD_VENDOR = 0.05;
	public static final double MARGIN_UNIFORM_COSTS = 0.10;
	public static final double GST_UNIFORM_COSTS = 0.18;

	public static final int MARGIN_HK_PERCENT = 10;
	public static final int GST_HK_PERCENT = 18;
	public static final int MARGIN_LAUNDRY_PERCENT = 10;
	public static final int GST_LAUNDRY_PERCENT = 18;
	public static final int MARGIN_RC_PERCENT = 10;
	public static final int GST_RC_PERCENT = 18;
	public static final int MARGIN_OE_PERCENT = 10;
	public static final int GST_OE_PERCENT = 18;
	public static final int MARGIN_SECURITY_PERCENT = 10;
	public static final int GST_SECURITY_PERCENT = 18;
	public static final int MARGIN_SUBSCRIPTION_SUPPLIES_PERCENT = 10;
	public static final int GST_SUBSCRIPTION_SUPPLIES_PERCENT = 18;
	public static final int MARGIN_REPAIR_MAINTENANCE_PERCENT = 10;
	public static final int GST_REPAIR_MAINTENANCE_PERCENT = 18;
	public static final int MARGIN_FOOD_STANZA_KITCHEN_PERCENT = 30;
	public static final int GST_FOOD_STANZA_KITCHEN_PERCENT = 5;
	public static final int MARGIN_FOOD_VENDOR_PERCENT = 10;
	public static final int GST_FOOD_VENDOR_PERCENT = 5;
	public static final int MARGIN_UNIFORM_COSTS_PERCENT = 10;
	public static final int GST_UNIFORM_COSTS_PERCENT = 18;
	public static final double HUNDRED_VALUE_IN_DOUBLE = 100.0;
	public static final double THIRTY_VALUE_IN_DOUBLE = 30.0;
	public static final int TWO_VALUE_IN_INTEGER = 2;
	public static final int ONE_VALUE_IN_INTEGER = 1;
	public static final int FIVE_VALUE_IN_INTEGER = 5;
	public static final double DAYS_IN_YEAR_IN_DOUBLE = 365.0;
	public static final double DAYS_IN_MONTH_IN_DOUBLE = 30.0;
	public static final int DAYS_IN_MONTH_IN_INT = 30;
	public static final int MONTH_IN_YEAR_IN_INT = 12;
	public static final double MONTH_IN_YEAR_IN_DOUBLE = 12.0;
	public static final double FORECAST_DEFAULT_ALLOWED_DEVIATION_PERCENT = 5d;
	
	public static final BigDecimal HUNDRED_VALUE_IN_BIGDECIMAL = new BigDecimal(100);
	public static final BigDecimal MONTHS_BIGDECIMAL =  new BigDecimal(12);
	public static final BigDecimal DAYS_IN_MONTH_IN_BIGDECIMAL = new BigDecimal(30);
	public static final BigDecimal DAYS_IN_YEAR_IN_BIGDECIMAL = new BigDecimal(365);
	public static final BigDecimal DAYS_IN_WEEK_IN_BIGDECIMAL = new BigDecimal(7);


}
