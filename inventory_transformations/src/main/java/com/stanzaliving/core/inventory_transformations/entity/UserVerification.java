package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "USER_VERIFICATION")
public class UserVerification implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "UUID", nullable = false)
    private String UUID;

    @Column(name = "VISIT")
    private Boolean VISIT;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "USER_TYPE")
    private String userType;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    
}