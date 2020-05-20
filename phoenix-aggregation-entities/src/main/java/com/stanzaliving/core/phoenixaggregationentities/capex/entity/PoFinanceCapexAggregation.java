package com.stanzaliving.core.phoenixaggregationentities.capex.entity;

import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "vendor_finance_payment_entity")
@Table(name = "vendor_finance_payment_entity",
        uniqueConstraints = @UniqueConstraint(columnNames = {"property_meta_info_id","vendor_uuid","po_type"}))
public class PoFinanceCapexAggregation extends AbstractJpaEntity {

    @Column(name = "property_meta_info_id",nullable = false)
    private String propertyMetaInfoUuid;

    @Column(name = "vendor_uuid",nullable = false)
    private String vendorUuid;

    @Column(name = "po_type",nullable = false)
    private String poType;

    @Column(name = "total_amount", nullable = false)
    private Double totalAmount;

    @Column(name = "regular_amount")
    private Double regularAmount;

    @Column(name = "advance_amount")
    private Double advanceAmount;

    @Column(name = "total_invoices")
    private Integer totalInvoiceCount;
}
