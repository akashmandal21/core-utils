package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT_ROOM_IMAGES")
public class StudentRoomImages {
	@Id
	private String id;

	@JoinColumn(name = "STUDENT_ONBOARDING_DETAILS_ID")
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private StudentOnboardingDetails studentOnboradingId;

	@Column(name = "IMAGE_ID")
	private int imageId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public StudentOnboardingDetails getStudentOnboradingId() {
		return studentOnboradingId;
	}
	public void setStudentOnboradingId(StudentOnboardingDetails studentOnboradingId) {
		this.studentOnboradingId = studentOnboradingId;
	}
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	public void setImage_id(int image_id) {
		this.imageId = image_id;
	}

}
