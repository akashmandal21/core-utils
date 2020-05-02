package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "JOBS")
public class JOBS implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JOB_ID", insertable = false, nullable = false)
    private Integer jobId;

    @Column(name = "START")
    private LocalDateTime START;

    @Column(name = "END")
    private LocalDateTime END;

    @Column(name = "STATUS")
    private String STATUS;

    @Column(name = "JOB_TYPE", nullable = false)
    private Integer jobType;

    
}