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

    public static final String COMMENTS_SERVICE_NAME_PRODUCT_MIX = "productmix";

    public static final String COMMENTS_SERVICE_NAME_PROPERTY_TEMPLATE = "PROPERTY_TEMPLATE";

    public static final String COMMENTS_SERVICE_NAME_ROOM_TEMPLATE = "ROOM_TEMPLATE";

    public static final List<String> PROPERTY_TEMPLATE_REJECT_REASONS = new ArrayList<String>() {{
        add("Property zone(s) selected wrongly");
        add("Property attribute(s) selected wrongly");
        add("Correction(s) needed in the basic info for the property template");
        add("Template already exists for the property type & brand");
        add("Other");
    }};

    public static final List<String> ROOM_TEMPLATE_REJECT_REASONS = new ArrayList<String>() {{
        add("Room feature(s) selected wrongly");
        add("Room consumable(s) selected wrongly");
        add("Correction(s) needed in the basic info for the room template");
        add("Template already exists for the property type & brand");
        add("Qty wrongly entered for room consumables");
        add("Other");
    }};

    public static final List<String> PRODUCT_MIX_REJECT_REASONS = new ArrayList<String>() {{
        add("Wrong choice of room template for one or more room(s)");
        add("Property template chosen needs to be changed");
        add("Number of rooms entered wrongly");
        add("Product mix for this property already exists");
        add("Other");
    }};

    public static final String TRUE = "YES";

    public static final String FALSE = "NO";

    public static final String BLANK_SPACE = " ";

    public static final String ROOM_TEMPLATE_EDIT_ROLE = "ROOM_TEMPLATE_EDIT";

    public static final String ROOM_TEMPLATE_APPROVE_ROLE = "ROOM_TEMPLATE_APPROVE";

    public static final String PROPERTY_TEMPLATE_EDIT_ROLE = "PROPERTY_TEMPLATE_EDIT";

    public static final String PROPERTY_TEMPLATE_APPROVE_ROLE = "PROPERTY_TEMPLATE_APPROVE";

    public static final String PRODUCT_MIX_EDIT_ROLE = "PRODUCT_MIX_EDIT";

    public static final String PRODUCT_MIX_APPROVE_ROLE = "PRODUCT_MIX_APPROVE";

    public static final String ACCESS_LEVEL_UUID_OF_INDIA = "7d0e47bf-52c0-4560-924e-e6599e56501a";
}
