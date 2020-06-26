package com.stanzaliving.po.enums;

import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
public enum PoStatus {

    IN_DRAFT("In Draft", 0, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.SALES)),
    TH_APPROVAL_PENDING("Transformation Head Approval Pending", 1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.TRANSFORMATIONS)),
    TH_APPROVED("Approved By Transformation Head", 2, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.TRANSFORMATIONS)),
    SENT_BACK_BY_TH("Sent Back By Transformation Head", -1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.TRANSFORMATIONS)),
    SALES_CT_APPROVAL_PENDING("Sales Central Team Approval Pending", 1, Arrays.asList(Department.SALES)),
    SALES_CT_APPROVED("Approved By Sales Central Team", 2, Arrays.asList(Department.SALES)),
    SENT_BACK_BY_SALES_CT("Sent Back By Sales Central Team", -1, Arrays.asList(Department.SALES)),
    TH_PARTIAL_CANCELLATION_PENDING("Transformation Head Partial Cancellation Pending", 1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.TRANSFORMATIONS)),
    TH_PARTIALLY_CANCELLED("Partially Cancelled By Transformation Head", -1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.TRANSFORMATIONS)),
    TH_CANCELLATION_PENDING("Transformation Head Cancellation Pending", 1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.TRANSFORMATIONS)),
    TH_CANCELLED("Cancelled By Transformation Head", -1, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.TRANSFORMATIONS)),
    WORK_COMPLETED("Work Completed", 3, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.TRANSFORMATIONS, Department.SALES)),
    INVOICE_SUBMITTED("Invoice Submitted", 4, Arrays.asList(Department.DESIGN, Department.PROCUREMENT, Department.TRANSFORMATIONS, Department.SALES)),
    PO_CLOSED("Po Closed", 5, Arrays.asList(Department.SALES)),
    SENT_BACK_BY_FINANCE("Sent back by finance", 8, null);

    private String status;

    private Integer order;

    private List<Department> departments;

}


