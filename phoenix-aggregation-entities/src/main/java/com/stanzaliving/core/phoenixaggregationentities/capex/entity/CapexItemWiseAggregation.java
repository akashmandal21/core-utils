package com.stanzaliving.core.phoenixaggregationentities.capex.entity;

import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "capex_item_wise_aggregation")
@Table(name = "capex_item_wise_aggregation",
        uniqueConstraints = @UniqueConstraint(columnNames = {"property_meta_info_id","item_code","area_of_use"}))

public class CapexItemWiseAggregation extends AbstractJpaEntity {

    @Column(name = "property_meta_info_id",nullable = false)
    private String propertyMetaInfoUuid;

    @Column(name = "item_code", nullable = false)
    private String itemCode;

    @Column(name = "item_type", nullable = false)
    private String itemType;

    @Column(name = "area_of_use", nullable = false)
    private String areaOfUse;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "acquistion_type",nullable = false)
    private String acquistionType;

    @Column(name = "item_area_of_use_wt",nullable = false)
    private BigDecimal itemAreaOfUseWeight;

    @Column(name = "master_boq_quantity",nullable = false)
    private BigDecimal masterBoqQuantity;

    @Column(name = "master_boq_cost",nullable = false)
    private BigDecimal masterBoqCost;

    @Column(name = "budgeted_cost", nullable = false)
    private BigDecimal budgetedCost;

    @Column(name = "budgeted_quantity", nullable = false)
    private BigDecimal budgetedQuantity;

    @Column(name = "budgeted_wt_committed_cost")
    private BigDecimal budgetedWeightedCommittedCost;

    @Column(name = "budgeted_wt_actual_cost")
    private BigDecimal budgetedWeightedActualCost;

    @Column(name = "committed_wt_cost")
    private BigDecimal committedWeightedCost;

    @Column(name = "actual_wt_cost")
    private BigDecimal actualWeightedCost;
}
