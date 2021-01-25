package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "STUDENT_ROOM_IMAGES")
@Entity
@IdClass(StudentRoomImagesEntity.class)
public class StudentRoomImagesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ONBOARDING_DETAILS_ID", insertable = false, nullable = false)
	@JsonProperty("STUDENT_ONBOARDING_DETAILS_ID")
    private Integer studentOnboardingDetailsId;

    @Id
    @Column(name = "IMAGE_ID", insertable = false, nullable = false)
	@JsonProperty("IMAGE_ID")
    private Integer imageId;

    
}