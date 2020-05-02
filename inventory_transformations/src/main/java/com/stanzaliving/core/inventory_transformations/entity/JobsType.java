package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "JOBS_TYPE")
@Entity
public class JobsType implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "JOB_TYPE", nullable = false)
    private Integer jobType;

    @Column(name = "JOB_NAME", nullable = false)
    private String jobName = "";

    
}