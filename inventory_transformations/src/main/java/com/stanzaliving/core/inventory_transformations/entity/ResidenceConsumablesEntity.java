package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "RESIDENCE_CONSUMABLES")
@Entity
@IdClass(ResidenceConsumablesEntity.class)
public class ResidenceConsumablesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "RESIDENCE_ID", insertable = false, nullable = false)
	@JsonProperty("residence_id")
    private Integer residenceId;

    //@Id
    @Column(insertable = false, name = "CONSUMABLES_ID", nullable = false)
	@JsonProperty("consumables_id")
    private Integer consumablesId;

    
}