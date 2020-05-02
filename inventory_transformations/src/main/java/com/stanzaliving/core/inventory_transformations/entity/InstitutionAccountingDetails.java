package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "INSTITUTION_ACCOUNTING_DETAILS")
@Entity
public class InstitutionAccountingDetails implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "INSTITUTION_ID", nullable = false)
    private Integer institutionId;

    @Column(name = "ACCOUNTS_EMAIL", nullable = false)
    private String accountsEmail;

    @Column(name = "ACCOUNTS_Phone", nullable = false)
    private String accountsPhone;

    @Column(name = "ACCOUNTS_POC", nullable = false)
    private String accountsPoc;

    @Column(name = "GST_NUMBER", nullable = false)
    private String gstNumber;

    @Column(name = "PAN_NUMBER", nullable = false)
    private String panNumber;

    
}