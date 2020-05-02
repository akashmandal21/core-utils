package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "ENUM_STORE")
public class EnumStore implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "ENUM_KEY", nullable = false)
    private String enumKey;

    @Column(name = "ENUM_VALUE", nullable = false)
    private String enumValue;

    
}