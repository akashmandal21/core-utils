package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Table(name = "SPECIAL_REQUEST")
@Entity
public class SpecialRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SPECIAL_REQUEST_ID", insertable = false, nullable = false)
    private Integer specialRequestId;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "NAME", nullable = false)
    private String NAME;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    
}