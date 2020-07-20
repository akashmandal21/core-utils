package com.stanzaliving.po.enums;

import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
public enum PoStatus {

    IN_DRAFT("In Draft", 0, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.SALES), "#ADADF4", "#0002CF"),
    TH_APPROVAL_PENDING("Transformation Head Approval Pending", 1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS), "#ADADF4", "#0002CF"),
    TH_APPROVED("Approved By Transformation Head", 2, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS), "#C9E6CA", "#2F9A34"),
    SENT_BACK_BY_TH("Sent Back By Transformation Head", -1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS), "#E5E5E5", "#3F3F3F"),
    TH_SHORT_CLOSE_PENDING("Transformation Head Short Close Pending", 1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS), "#FEECD3", "#FEECD3"),
    TH_SHORT_CLOSED("Short Closed By Transformation Head", -1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS), "#FAD1CC", "#790A00"),
    TH_CANCELLATION_PENDING("Transformation Head Cancellation Pending", 1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS), "#E4EDFB", "#4B87E3"),
    TH_CANCELLED("Cancelled By Transformation Head", -1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS), "#E7E4F1", "#5C49A2"),
    SALES_CT_APPROVAL_PENDING("Approval Pending", 1, Arrays.asList(Department.SALES), "#ADADF4", "#0002CF"),
    SALES_CT_APPROVED("Approved", 2, Arrays.asList(Department.SALES), "#C9E6CA", "#2F9A34"),
    SENT_BACK_BY_SALES_CT("Rejected", -1, Arrays.asList(Department.SALES), "#E5E5E5", "#3F3F3F"),
    SALES_CT_SHORT_CLOSE_PENDING("Short Close Pending", 1, Arrays.asList(Department.SALES), "#FEECD3", "#FEECD3"),
    SALES_CT_SHORT_CLOSED("Short Closed", -1, Arrays.asList(Department.SALES), "#FAD1CC", "#790A00"),
    SALES_CT_CANCELLATION_PENDING("Cancellation Pending", 1, Arrays.asList(Department.SALES), "#E4EDFB", "#4B87E3"),
    SALES_CT_CANCELLED("Cancelled", -1, Arrays.asList(Department.SALES), "#E7E4F1", "#5C49A2"),
    WORK_COMPLETED("GRN Work Completed", 3, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS, Department.SALES), "#F1F3C2", "#898F07"),
    INVOICE_SUBMITTED("Invoice Submitted", 4, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.GC, Department.TRANSFORMATIONS, Department.SALES, Department.FINANCE), "#CAFFF3", "#0B6550"),
    PO_CLOSED("PO Closed", 5, Arrays.asList(Department.SALES), "#FFDEB4", "#F5413B");

    private String status;

    private Integer order;

    private List<Department> departments;

    private String backgroundColor;

    private String textColor;

}


