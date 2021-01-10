package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "STUDENT_ADDITIONAL_CONTACT")
@Data
@Entity
public class StudentAdditionalContactEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ID", insertable = false, nullable = false)
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "EMAIL")
	@JsonProperty("EMAIL")
    private String EMAIL;

    @Column(name = "MOBILE")
	@JsonProperty("MOBILE")
    private String MOBILE;

    @Column(name = "NAME")
	@JsonProperty("NAME")
    private String NAME;

    @Column(name = "RELATION_TO_STUDENT")
	@JsonProperty("RELATION_TO_STUDENT")
    private String relationToStudent;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    
}