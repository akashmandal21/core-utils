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
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "CATEGORY_NAME", nullable = false)
	@JsonProperty("category_name")
    private String categoryName;

    @Column(name = "ENABLED")
	@JsonProperty("enabled")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "DEPARTMENT_NAME")
	@JsonProperty("department_name")
    private String departmentName;

    @Column(name = "INVOICE_TYPES")
	@JsonProperty("invoice_types")
    private String invoiceTypes = "0";

    @Column(name = "COMMENTS_REQUIRED")
	@JsonProperty("comments_required")
    private Boolean commentsRequired = Boolean.FALSE;

    @Column(name = "VENDOR_SELECTION")
	@JsonProperty("vendor_selection")
    private Boolean vendorSelection = Boolean.FALSE;

    @Column(name = "IMPACT_TYPE")
	@JsonProperty("impact_type")
    private Boolean impactType = false;

    @Column(name = "DESCRIPTION")
	@JsonProperty("description")
    private String DESCRIPTION;

    
}