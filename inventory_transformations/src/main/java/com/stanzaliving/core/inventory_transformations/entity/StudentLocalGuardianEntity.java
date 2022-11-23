package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "STUDENT_LOCAL_GUARDIAN")
@Entity
public class StudentLocalGuardianEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ID", insertable = false, nullable = false)
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "MOBILE")
	@JsonProperty("MOBILE")
    private String MOBILE;

    @Column(name = "NAME")
	@JsonProperty("NAME")
    private String NAME;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "GUARDIAN_ADDRESS_ID")
	@JsonProperty("GUARDIAN_ADDRESS_ID")
    private Integer guardianAddressId;

    
}