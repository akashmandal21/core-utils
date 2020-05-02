package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "STUDENT_ROOM_IMAGES")
@Entity
public class StudentRoomImages implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ONBOARDING_DETAILS_ID", insertable = false, nullable = false)
    private Integer studentOnboardingDetailsId;

    @Id
    @Column(name = "IMAGE_ID", insertable = false, nullable = false)
    private Integer imageId;

    
}