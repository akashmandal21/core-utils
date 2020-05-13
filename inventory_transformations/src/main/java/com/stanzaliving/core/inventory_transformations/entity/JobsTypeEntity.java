package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "JOBS_TYPE")
public class JobsTypeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "JOB_TYPE", nullable = false)
	@JsonProperty("job_type")
    private Integer jobType;

    @Column(name = "JOB_NAME", nullable = false)
	@JsonProperty("job_name")
    private String jobName = "";

    
}