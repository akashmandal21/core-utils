package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "STUDENT_CONTACT_AUDIT")
public class StudentContactAudit {
	
	@Id
	@Column(name = "STUDENT_ID")
	private String studentId;

	@Column(name = "OLD_EMAILID", nullable = false)
	private String oldEmail;

	@Column(name = "OLD_PHONE", nullable = false)
	private String oldPhone;

	@Column(name = "CREATED", nullable = false)
	private Date created = new Date();

	@Column(name = "UPDATED", nullable = false)
	private Date updated = new Date();

	@Column(name = "TEMPORARY_STUDENTID", nullable = false)
	private int temporaryStudentId;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getOldEmail() {
		return oldEmail;
	}

	public void setOldEmail(String oldEmail) {
		this.oldEmail = oldEmail;
	}

	public String getOldPhone() {
		return oldPhone;
	}

	public void setOldPhone(String oldPhone) {
		this.oldPhone = oldPhone;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public int getTemporaryStudentId() {
		return temporaryStudentId;
	}

	public void setTemporaryStudentId(int temporaryStudentId) {
		this.temporaryStudentId = temporaryStudentId;
	}
	
}
