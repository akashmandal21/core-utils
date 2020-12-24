package com.stanzaliving.core.cafe.order.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class NotificationConstants {
    public final String STANZA_LOGO = "logo";

    @UtilityClass
    public class SMSConstant {
        public final String USER_NAME = "<firstName>";
        public final String USER_EMAIL = "<email>";
        public final String USER_MOBILE = "<mobile>";
        public final String USER_RESIDENCE = "<residence>";
        public final String DELIVERY_ROOM = "<deliveryRoom>";
        public final String DELIVERY_RESIDENCE = "<deliveryResidence>";
        public final String DELIVERY_INSTRUCTION = "<deliveryInstruction>";
        public final String DELIVERY_TYPE = "<deliveryType>";
        public final String ORDER_ID = "<orderId>";
        public final String ORDER_CODE = "<orderCode>";
        public final String DELIVERY_CODE = "<deliveryCode>";
        public final String ORDER_TIME = "<orderTime>";
        public final String EXPECTED_DELIVERY_TIME = "<expectedDeliveryTime>";
        public final String DELIVERY_TIME = "<deliveryTime>";
        public final String DISPTACH_USER_ID = "<dispatchUserId>";
        public final String DISPATCH_TIME = "<dispatchTime>";
        public final String CAFE = "<cafe>";
        public final String DISPATCH_CODE = "<dispatchCode>";
        public final String AMOUNT = "<amount>";
        public final String GST = "<gst>";
        public final String TOTAL_AMOUNT = "<totalAmount>";
        public final String FINAL_AMOUNT = "<finalAmount>";
        public final String FINAL_GST = "<finalGst>";
        public final String FINAL_TOTAL_AMOUNT = "<finalTotalAmount>";
        public final String ORDER_STATUS = "<orderStatus>";
        public final String SERVING_MODE = "<mode>";
        public final String HOT_BAGS = "<hot-bags>";
        public final String PACKETS = "<packet>";
        public final String ORDER = "<order>";
        public final String RECEIVED_HOT_BAGS = "<received-hot-bags>";
        public final String RECEIVED_PACKETS = "<received-packet>";
        public final String RECEIVED_ORDER = "<received-order>";
        public final String ORDER_ITEMS = "<orderItems>";
        public final String REFUNDED_ITEMS = "<refundItems>";
    }

    @UtilityClass
    public class EmailConstant {
        public final String ORDER_ID = "orderId";
        public final String ROOM_DELIVERY = "roomDelivery";
        public final String DELIVERY = "delivery";
        public final String ORDER_CODE = "orderCode";
        public final String DELIVERY_CODE = "deliveryCode";
        public final String ORDER_TIME = "orderTime";
        public final String EXPECTED_DELIVERY_TIME = "expectedDeliveryTime";
        public final String DELIVERY_TIME = "deliveryTime";
        public final String DISPTACH_USER_ID = "dispatchUserId";
        public final String CAFE = "cafe";
        public final String DISPATCH_CODE = "dispatchCode";
        public final String AMOUNT = "amount";
        public final String GST = "gst";
        public final String TOTAL_AMOUNT = "totalAmount";
        public final String FINAL_AMOUNT = "finalAmount";
        public final String FINAL_GST = "finalGst";
        public final String FINAL_TOTAL_AMOUNT = "finalTotalAmount";
        public final String ORDER_STATUS = "orderStatus";
        public final String SERVING_MODE = "mode";
        public final String ORDER_DETAILS = "items";
        public final String VAS_ITEMS = "vasItems";
        public final String CHARGES_ITEMS = "chargeItems";
        public final String COUPON_ITEMS = "couponItems";
        public final String USER_DETAILS = "user";
        public final String DELIVERY_PREFERENCE = "deliveryPreference";
        public final String HOT_BAGS = "hotBagsCount";
        public final String PACKETS = "packetCount";
        public final String ORDER = "orderCount";
        public final String RECEIVED_HOT_BAGS = "receivedHotBags";
        public final String RECEIVED_PACKETS = "receivedPacket";
        public final String RECEIVED_ORDER = "receivedOrder";
        public final String QR_CODE = "qrCode";
        public final String ITEM_AMOUNT = "itemAmount";
        public final String CHARGES_AMOUNT = "chargesAmount";
        public final String COUPON_AMOUNT = "couponAmount";

    }
}
