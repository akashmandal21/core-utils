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
	@JsonProperty("student_onboarding_details_id")
    private String studentOnboardingDetailsId;

    @Id
    @Column(insertable = false, name = "CONSUMABLES_ID", nullable = false)
	@JsonProperty("consumables_id")
    private Integer consumablesId;

    
}