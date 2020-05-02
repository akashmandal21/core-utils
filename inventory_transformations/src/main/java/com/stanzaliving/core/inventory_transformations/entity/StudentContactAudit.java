package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "STUDENT_CONTACT_AUDIT")
public class StudentContactAudit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "STUDENT_ID", nullable = false)
    private String studentId = "";

    @Column(name = "TEMPORARY_STUDENTID", nullable = false)
    private String temporaryStudentid;

    @Column(name = "OLD_EMAILID", nullable = false)
    private String oldEmailid = "";

    @Column(name = "OLD_PHONE", nullable = false)
    private String oldPhone = "";

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    
}