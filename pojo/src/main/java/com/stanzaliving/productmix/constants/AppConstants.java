package com.stanzaliving.productmix.constants;

import java.util.ArrayList;
import java.util.List;

public final class AppConstants {
    public static final String SUCCESS = "SUCCESS";

    public static final String CREATED = "CREATED";

    public static final String PROPERTY_TEMPLATE_APPROVE = "approve";

    public static final String PROPERTY_TEMPLATE_REJECT = "reject";

    public static final String PROPERTY_TEMPLATE_DELETE = "delete";

    public static final String PROPERTY_TEMPLATE_ACTION_INACTIVE = "inactive";

    public static final String PROPERTY_TEMPLATE_ACTION_ACTIVE = "active";

    public static final String ROOM_TEMPLATE_APPROVE = "approve";

    public static final String ROOM_TEMPLATE_REJECT = "reject";

    public static final String ROOM_TEMPLATE_DELETE = "delete";

    public static final String ROOM_ACTION_INACTIVE = "inactive";

    public static final String PRODUCT_MIX_ROOM_TEMPLATE = "room template";

    public static final String PRODUCT_MIX_PROPERTY_TEMPLATE = "property template";

    public static final String PRODUCT_MIX = "product mix";

    public static final String IDENTIFIER_CODE_ROOM_TEMPLATE = "RT_";

    public static final String IDENTIFIER_CODE_PROPERTY_TEMPLATE = "PT_";

    public static final String IDENTIFIER_CODE_PRODUCT_MIX = "ProdMix_";

    public static final int SINGLE_RECORD = 1;

    public static final String SAMPLE_CSV_PRODUCT_MIX = "Sample CSV Product Mix";

    public static final String ROOM_HEADER_ROOM_NO = "Room No.";

    public static final String ROOM_HEADER_FLOOR = "Floor No.";

    public static final String ROOM_HEADER_ROOM_TEMPLATE = "Template UID";

    public static final List<String> PROPERTY_TEMPLATE_REJECT_REASONS = new ArrayList<String>() {{
        add("Strategic Location (College Perspective");
        add("Strategic Location (Hotspot Perspective");
        add("Brand New Property");
        add("Well Ventilated Rooms");
        add("Running Hostel With Full Occupancy");
        add("Main Road Frontage");
        add("Other");
    }};

    public static final List<String> ROOM_TEMPLATE_REJECT_REASONS = new ArrayList<String>() {{
        add("Strategic Location (College Perspective");
        add("Strategic Location (Hotspot Perspective");
        add("Brand New Property");
        add("Well Ventilated Rooms");
        add("Running Hostel With Full Occupancy");
        add("Main Road Frontage");
        add("Other");
    }};

    public static final List<String> PRODUCT_MIX_REJECT_REASONS = new ArrayList<String>() {{
        add("Strategic Location (College Perspective");
        add("Strategic Location (Hotspot Perspective");
        add("Brand New Property");
        add("Well Ventilated Rooms");
        add("Running Hostel With Full Occupancy");
        add("Main Road Frontage");
        add("Other");
    }};
}
