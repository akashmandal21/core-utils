package com.stanzaliving.core.electricity.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ElectricityConstants {
	
	public final String COMMON_AREA_METER = "605ff271-e5f5-49e9-9c76-e1ba8b4cd509";
	public final String ROOM_METER = "4b34cdd3-3686-4f9d-b962-a0250c168580";
	public final String MAIN_METER = "239bc32d-7de0-4e61-86a3-e8c05737714d";
	public final String KITCHEN_METER = "e82d9efb-f00f-48a5-b7de-8be03cc5081e";

	public final String PREPAID = "prepaid";
	
	public final String OVERALL_BILLS = "Overall Bills";
	public final String INVOICING_PENDING = "Invoicing Pending";
	public final String INVOICING_DONE = "Invoicing Done";
	
	public final String PENDING_APPROVAL = "Pending Approval";
	public final String APPROVED = "Approved";	
	
	public static final String ROOM_UNIT_RATE_CONFIG_PATH = "electricity.room.rate";
	public static final String COMMON_AREA_UNIT_RATE_CONFIG_PATH = "electricity.common_area.rate";
	
	public static final String ROOM_UNIT_RATE_GST_CONFIG_PATH = "electricity.room.gst";
	public static final String COMMON_AREA_UNIT_RATE_GST_CONFIG_PATH = "electricity.common_area.gst";
	
	public static final String STANZA_SHARE_CONFIG_PATH = "postpaidChargesDto.stanzaShareTotal";
	public static final String RESIDENT_SHARE_CONFIG_PATH = "postpaidChargesDto.residentShareTotal";


}
