package com.stanzaliving.website.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class WebsiteApartmentFilterConstants {

	public final String FILTER_NAME = "Filters";
	
	public final Integer FILTER_PROPERTY_TYPE_SEQUENCE_ID = 1;
	public final String FILTER_PROPERTY_TYPE_NAME = "Property Type";
	
	public final String PROPERTY_TYPE_PG_HOSTELS_NAME = "PG & Hostels";
	public final String PROPERTY_TYPE_APARTMENT_NAME = "Managed Apartments";

	public final Integer FILTER_SORT_BY_SEQUENCE_ID = 2;
	public final String FILTER_SORT_BY_NAME = "SORT BY";
	
	public final String LOWEST_PRICE_FIRST = "Lowest Price First";
	public final String HIGHEST_PRICE_FIRST = "Highest Price First";
	public final String ASC = "asc";
	public final String DESC = "desc";

	public final Integer FILTER_LOCALITY_SEQUENCE_ID = 3;
	public final String FILTER_LOCALITY_NAME = "LOCALITY";

	public final Integer FILTER_PRICE_SEQUENCE_ID = 4;
	public final String FILTER_PRICE_NAME = "PRICE";

	public final Integer FILTER_GENDER_SEQUENCE_ID = 5;
	public final String FILTER_GENDER_NAME = "GENDER";
	
	public final Integer FILTER_ROOM_COUNT_SEQUENCE_ID = 6;
	public final String FILTER_ROOM_COUNT_NAME = "NO OF BEDROOMS";
	public final String FILTER_ROOM_BHK_NAME = " BHK";
	public final String FILTER_ROOM_4_PLUS_BHK_NAME = "4+ BHK";
	public final Integer FILTER_ROOM_4_PLUS_BHK_VALUE = 99;
	public final String FILTER_SINGLE_ROOM= " Single Room";
	
	public final Integer FILTER_ROOMS_SEQUENCE_ID = 7;
	public final String FILTER_ROOMS_NAME = "ROOMS";
	
	public final Integer FILTER_AMENITIES_SEQUENCE_ID = 8;
	public final String FILTER_AMENITIES_NAME = "AMENITIES";

	public final Integer FILTER_SERVICES_SEQUENCE_ID = 9;
	public final String FILTER_SERVICES_NAME = "SERVICES";
}