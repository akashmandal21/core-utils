package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "JD_LEAD")
@Entity
@Data
public class JdLead implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "LEAD_ID", insertable = false, nullable = false)
    private String leadId;

    @Column(name = "LEAD_TYPE")
    private String leadType;

    @Column(name = "PREFIX")
    private String PREFIX;

    @Column(name = "NAME")
    private String NAME;

    @Column(name = "MOBILE")
    private String MOBILE;

    @Column(name = "PHONE")
    private String PHONE;

    @Column(name = "EMAIL")
    private String EMAIL;

    @Column(name = "LEAD_DATE")
    private LocalDateTime leadDate;

    @Column(name = "CATEGORY")
    private String CATEGORY;

    @Column(name = "CITY")
    private String CITY;

    @Column(name = "AREA")
    private String AREA;

    @Column(name = "BRANCH_AREA")
    private String branchArea;

    @Column(name = "DNC_MOBILE")
    private Integer dncMobile = 0;

    @Column(name = "DNC_PHONE")
    private Integer dncPhone = 0;

    @Column(name = "COMPANY")
    private String COMPANY;

    @Column(name = "PINCODE")
    private String PINCODE;

    @Column(name = "LEAD_TIME")
    private String leadTime;

    @Column(name = "BRANCH_PIN")
    private String branchPin;

    @Column(name = "PARENT_ID")
    private String parentId;

    
}