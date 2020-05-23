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
        uniqueConstraints = @UniqueConstraint(columnNames = {"property_meta_info_id","vendor_uuid","po_type","item_code","invoice_type"}))
public class PoFinanceCapexAggregation extends AbstractJpaEntity {

    @Column(name = "property_meta_info_id",nullable = false)
    private String propertyMetaInfoUuid;

    @Column(name = "vendor_uuid",nullable = false)
    private String vendorUuid;

    @Column(name = "item_code",nullable = false)
    private String itemCode;

    @Column(name = "po_type",nullable = false)
    private String poType;

    @Column(name="invoice_type",nullable = false)
    private String invoiceType;

    @Column(name = "item_quantity", nullable = false)
    private Double itemQuantity;

    @Column(name = "total_billed_amount")
    private Double billedAmount;

    @Column(name = "total_wt_paid_amount")
    private Double totalWeightedPaidAmount;

    @Column(name = "total_wt_paid_quantity")
    private Double totalWeightedPaidQuantity;
}
