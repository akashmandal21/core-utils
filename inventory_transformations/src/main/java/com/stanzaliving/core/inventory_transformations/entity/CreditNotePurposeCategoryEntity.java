package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "CREDIT_NOTE_PURPOSE_CATEGORY")
@Entity
@Data
public class CreditNotePurposeCategoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "CATEGORY_NAME", nullable = false)
	@JsonProperty("CATEGORY_NAME")
    private String categoryName;

    @Column(name = "ENABLED")
	@JsonProperty("ENABLED")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "DEPARTMENT_NAME")
	@JsonProperty("DEPARTMENT_NAME")
    private String departmentName;

    @Column(name = "INVOICE_TYPES")
	@JsonProperty("INVOICE_TYPES")
    private String invoiceTypes = "0";

    @Column(name = "COMMENTS_REQUIRED")
	@JsonProperty("COMMENTS_REQUIRED")
    private Boolean commentsRequired = Boolean.FALSE;

    @Column(name = "VENDOR_SELECTION")
	@JsonProperty("VENDOR_SELECTION")
    private Boolean vendorSelection = Boolean.FALSE;

    @Column(name = "IMPACT_TYPE")
	@JsonProperty("IMPACT_TYPE")
    private Boolean impactType = false;

    @Column(name = "DESCRIPTION")
	@JsonProperty("DESCRIPTION")
    private String DESCRIPTION;

    
}