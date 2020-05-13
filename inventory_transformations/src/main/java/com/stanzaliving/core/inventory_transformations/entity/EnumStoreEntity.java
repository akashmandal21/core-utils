package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ENUM_STORE")
public class EnumStoreEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "ENUM_KEY", nullable = false)
	@JsonProperty("enum_key")
    private String enumKey;

    @Column(name = "ENUM_VALUE", nullable = false, columnDefinition = "text")
	@JsonProperty("enum_value")
    private String enumValue;

    
}