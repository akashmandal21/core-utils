package com.stanzaliving.po.enums;

import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
public enum PoStatus {

    IN_DRAFT("In Draft", 0, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.SALES), "#faf7d8"),
    TH_APPROVAL_PENDING("Transformation Head Approval Pending", 1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS), "#efcfdd"),
    TH_APPROVED("Approved By Transformation Head", 2, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS), "#d0f6e6"),
    SENT_BACK_BY_TH("Sent Back By Transformation Head", -1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS), "#faf7d8"),
    TH_SHORT_CLOSE_PENDING("Transformation Head Short Close Pending", 1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS), "#efcfdd"),
    TH_SHORT_CLOSED("Short Closed By Transformation Head", -1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS), "#d0f6e6"),
    TH_CANCELLATION_PENDING("Transformation Head Cancellation Pending", 1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS), "#faf7d8"),
    TH_CANCELLED("Cancelled By Transformation Head", -1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS), "#efcfdd"),
    SALES_CT_APPROVAL_PENDING("Sales Central Team Approval Pending", 1, Arrays.asList(Department.SALES), "#d0f6e6"),
    SALES_CT_APPROVED("Approved By Sales Central Team", 2, Arrays.asList(Department.SALES), "#faf7d8"),
    SENT_BACK_BY_SALES_CT("Sent Back By Sales Central Team", -1, Arrays.asList(Department.SALES), "#efcfdd"),
    SALES_CT_SHORT_CLOSE_PENDING("Sales Central Team Short Close Pending", 1, Arrays.asList(Department.SALES), "#d0f6e6"),
    SALES_CT_SHORT_CLOSED("Short Closed By Sales Central Team", -1, Arrays.asList(Department.SALES), "#faf7d8"),
    SALES_CT_CANCELLATION_PENDING("Sales Central Team Cancellation Pending", 1, Arrays.asList(Department.SALES), "#efcfdd"),
    SALES_CT_CANCELLED("Cancelled By Sales Central Team", -1, Arrays.asList(Department.SALES), "#d0f6e6"),
    WORK_COMPLETED("Work Completed", 3, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS, Department.SALES), "#faf7d8"),
    INVOICE_SUBMITTED("Invoice Submitted", 4, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS, Department.SALES, Department.FINANCE), "#efcfdd"),
    PO_CLOSED("Po Closed", 5, Arrays.asList(Department.SALES), "#d0f6e6");

    private String status;

    private Integer order;

    private List<Department> departments;

    private String colorCode;

}


