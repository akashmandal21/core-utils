package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "STUDENT_CONSUMABLES_ORIG")
@Entity
@Data
@IdClass(StudentConsumablesOrigEntity.class)
public class StudentConsumablesOrigEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ONBOARDING_DETAILS_ID", insertable = false, nullable = false)
	@JsonProperty("STUDENT_ONBOARDING_DETAILS_ID")
    private String studentOnboardingDetailsId;

    @Id
    @Column(insertable = false, name = "CONSUMABLES_ID", nullable = false)
	@JsonProperty("CONSUMABLES_ID")
    private Integer consumablesId;

    
}