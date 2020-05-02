package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "STUDENT_ROOM_IMAGES_ORIG")
public class StudentRoomImagesOrig implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ONBOARDING_DETAILS_ID", insertable = false, nullable = false)
    private String studentOnboardingDetailsId;

    @Id
    @Column(name = "IMAGE_ID", insertable = false, nullable = false)
    private Integer imageId;

    
}