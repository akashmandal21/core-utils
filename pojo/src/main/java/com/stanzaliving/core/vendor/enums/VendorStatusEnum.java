package com.stanzaliving.core.vendor.enums;


import com.stanzaliving.core.generic.constants.GenericConstants;
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
    L1_APPROVED("Pending Approval L2",1,"#FAB432","#FBECDB"),
    L2_APPROVED("L2 Approved",2,"#FAB432","#FBECDB"),
    L1_REJECTED("Rejected L1", GenericConstants.rejectionStart-1,"#FF5238","#FFE5E1"),
    L2_REJECTED("Rejected L2", GenericConstants.rejectionStart-2,"#F55F71","#FFF1F1"),
    AUTO_APPROVED("Auto Approved",GenericConstants.approvalRestrictMax,"#60C3AD","#EDFFF5"),

    APPROVED("Approved",10,"#60C3AD","#EDFFF5"),
    INACTIVE("Inactive",11,"#5FC4F5","#EDF4FF");

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

