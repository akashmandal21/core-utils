package com.stanzaliving.core.phoenixaggregationentities.capex.entity;

import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "vendor_item_capex_entity")
@Table(name = "vendor_item_capex_entity",
        uniqueConstraints = @UniqueConstraint(columnNames = {"property_meta_info_id","vendor_uuid","item_code","po_type"}))
public class PoVendorItemCapexAggregation extends AbstractJpaEntity {

    @Column(name = "property_meta_info_id",nullable = false)
    private String propertyMetaInfoUuid;

    @Column(name = "vendor_uuid",nullable = false)
    private String vendorUuid;

    @Column(name = "po_type",nullable = false)
    private String poType;

    @Column(name = "item_code", nullable = false)
    private String itemCode;

    @Column(name = "quantity", nullable = false)
    private Double quantity;

    @Column(name = "amount")
    private Double amount;

}
