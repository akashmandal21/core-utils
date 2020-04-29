package com.stanzaliving.core.inventory_transformations.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CREDIT_NOTE_PURPOSE_CATEGORY")
@Data
public class CreditNotePurposeCategory {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "ENABLED", nullable = false)
    private Boolean enabled;

    @Column(name = "CATEGORY_NAME", nullable = false)
    private String name;

    @Column(name = "DEPARTMENT_NAME", nullable = false)
    private String departmentName;

    @Column(name = "VENDOR_SELECTION", nullable = false)
    private Boolean vendorSelection;

    @Column(name = "COMMENTS_REQUIRED", nullable = false)
    private Boolean commentsRequired;

    @Column(name = "IMPACT_TYPE", nullable = false)
    private Integer impactType;

    @Column(name = "INVOICE_TYPES", nullable = false)
    private String invoiceTypes;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

}
