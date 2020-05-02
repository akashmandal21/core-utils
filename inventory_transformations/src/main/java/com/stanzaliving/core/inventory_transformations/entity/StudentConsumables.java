package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "STUDENT_CONSUMABLES")
@Data
@Entity
public class StudentConsumables implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ONBOARDING_DETAILS_ID", insertable = false, nullable = false)
    private Integer studentOnboardingDetailsId;

    @Id
    @Column(insertable = false, name = "CONSUMABLES_ID", nullable = false)
    private Integer consumablesId;

    
}