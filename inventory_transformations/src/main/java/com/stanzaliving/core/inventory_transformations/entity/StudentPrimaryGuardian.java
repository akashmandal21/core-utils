package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "STUDENT_PRIMARY_GUARDIAN")
public class StudentPrimaryGuardian implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ID", insertable = false, nullable = false)
    private String studentId;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "EMAIL")
    private String EMAIL;

    @Column(name = "MOBILE")
    private String MOBILE;

    @Column(name = "NAME")
    private String NAME;

    @Column(name = "RELATION_TO_STUDENT")
    private String relationToStudent;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    
}