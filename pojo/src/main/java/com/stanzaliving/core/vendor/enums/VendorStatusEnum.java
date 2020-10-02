package com.stanzaliving.core.vendor.enums;

import com.stanzaliving.core.vendor.constants.VendorConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum VendorStatusEnum {
    /*
        Pls make sure that if you add another rejection level, subtract -3 or more depending on the rejection level
     */
    IN_DRAFT("In Draft",-1,"#7A7D7E","#E6E9EA"),
    SUBMITTED("Pending Approval L1",0,"#FFB701","#FFEAB6"),
    L1_APPROVED("Pending Approval L2",1,"#DEB76A","#FFEAB6"),
    L2_APPROVED("Approved",2,"#60C3AD","#EDFFF5"),
    L1_REJECTED("Rejected L1", VendorConstants.rejectionStart-1,"#F55F71","#FFF1F1"),
    L2_REJECTED("Rejected L2",VendorConstants.rejectionStart-2,"#FF5238","#FFF1F1"),
//    POST_DRAFT("Post Draft",-2,"#7A7D7E","#E6E9EA"),
    AUTO_APPROVED("Auto Approved",VendorConstants.approvalRestrictMax,"#60C3AD","#EDFFF5");

    private static Map<Integer,VendorStatusEnum> vendorStatusEnumMap = new HashMap<>();
    private static int maxOrder;
    private static int minOrder;
    static {
        maxOrder = 3;
        minOrder = -11;
        Arrays.stream(VendorStatusEnum.values()).forEach(f->vendorStatusEnumMap.put(f.getOrder(),f));
    }

    private String status;
    private Integer order;
    private String textColor;
    private String backgroundColor;

    public static VendorStatusEnum getVendorStatus(Integer order){
        return vendorStatusEnumMap.get(order);
    }

    public static int getMaxOrder(){
        return maxOrder;
    }
    public static int getMinOrder(){
        return minOrder;
    }
}

