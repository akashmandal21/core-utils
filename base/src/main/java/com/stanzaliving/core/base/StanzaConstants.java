/**
 * 
 */
package com.stanzaliving.core.base;

import java.time.ZoneId;

import lombok.experimental.UtilityClass;

/**
 * @author naveen
 *
 * @date 29-Sep-2019
 */
@UtilityClass
public class StanzaConstants {

	public static final String DATE_SEPARATOR = "-";
	public static final String IST_TIMEZONE = "Asia/Kolkata";
	public static final ZoneId IST_TIMEZONEID = ZoneId.of(IST_TIMEZONE);
	public static final String INDIA_COUNTRY_CODE = "91";
	public static final String INDIA_ISO_CODE = "IN";
	public static final int PRICE_ROUND_OFF_DIGITS = 2;

	public static final long SECONDS_IN_DAY = 86400;
	public static final long MILLI_SECONDS_IN_DAY = SECONDS_IN_DAY * 1000;

	public static final String ORGANIZATION_NAME = "Stanza Living";
	public static final String ORGANIZATION_DOMAIN = "https://www.stanzaliving.com";

	public static final String CITY_MANAGER = "CITY_MANAGER";
	public static final String CLUSTER_MANAGER = "CLUSTER_MANAGER";
}