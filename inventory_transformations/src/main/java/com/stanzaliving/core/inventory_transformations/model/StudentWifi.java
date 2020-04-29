package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "STUDENT_WIFI")
public class StudentWifi {
	
	@Id()
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "STUDENT_ID")
	private Student student;
	
	@Column(name = "ENABLED")
	private int enabled;
	
	@Column(name = "CHECKIN_DATE")
	private Date checkInDate = new Date();

	@Column(name = "CHECKOUT_DATE")
	private Date checkOutDate;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
}
