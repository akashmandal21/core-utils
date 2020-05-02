package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "CREDIT_NOTE_PURPOSE_CATEGORY")
@Entity
public class CreditNotePurposeCategory implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "CATEGORY_NAME", nullable = false)
    private String categoryName;

    @Column(name = "ENABLED")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "DEPARTMENT_NAME")
    private String departmentName;

    @Column(name = "INVOICE_TYPES")
    private String invoiceTypes = "0";

    @Column(name = "COMMENTS_REQUIRED")
    private Boolean commentsRequired = Boolean.FALSE;

    @Column(name = "VENDOR_SELECTION")
    private Boolean vendorSelection = Boolean.FALSE;

    @Column(name = "IMPACT_TYPE")
    private Integer impactType = 0;

    @Column(name = "DESCRIPTION")
    private String DESCRIPTION;

    
}