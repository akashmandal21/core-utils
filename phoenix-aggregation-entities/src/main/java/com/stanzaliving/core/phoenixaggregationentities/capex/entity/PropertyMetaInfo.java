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
@Entity(name = "property_meta_info")
@Table(name = "property_meta_info",
        uniqueConstraints = @UniqueConstraint(columnNames = {"property_uuid"}))
public class PropertyMetaInfo extends AbstractJpaEntity {

    @Column(name = "property_uuid", nullable = false)
    private String propertyUuid;

    @Column(name = "city",nullable = false)
    private String city;

    @Column(name = "micromarket",nullable = false)
    private String micromarket;

    @Column(name = "brand",nullable = false)
    private String brand;

    @Column(name = "zone",nullable = false)
    private String zone;

    @Column(name = "num_beds",nullable = false)
    private Integer numBeds;

    @Column(name="master_boq_approval_date",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date masterBoqApprovalDate;
}
