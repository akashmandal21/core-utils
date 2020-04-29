package com.stanzaliving.core.inventory_transformations.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="ROOM_CHANGE_DUES")
public class RoomChangeDues {
	
	@Id
	@Column(name = "REQUEST_UNIQUE_ID")
	private String reqUniqueId;
	
	@Column(name ="STUDENT_ID")
	private String studentId;
	
	@Column(name = "TOTAL_DUES")
	private double totalDues;
	
	@Column(name = "DUES_PAID")
	private double duesPaid;
	
	@Column(name = "CREATED_AT")
	private Date createdAt;
}
