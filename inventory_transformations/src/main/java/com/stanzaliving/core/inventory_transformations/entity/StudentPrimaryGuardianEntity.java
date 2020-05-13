package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "STUDENT_PRIMARY_GUARDIAN")
public class StudentPrimaryGuardianEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ID", insertable = false, nullable = false)
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "EMAIL")
	@JsonProperty("email")
    private String EMAIL;

    @Column(name = "MOBILE")
	@JsonProperty("mobile")
    private String MOBILE;

    @Column(name = "NAME")
	@JsonProperty("name")
    private String NAME;

    @Column(name = "RELATION_TO_STUDENT")
	@JsonProperty("relation_to_student")
    private String relationToStudent;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    
}