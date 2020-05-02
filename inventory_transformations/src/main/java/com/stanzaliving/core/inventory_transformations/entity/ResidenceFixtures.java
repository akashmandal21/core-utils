package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "RESIDENCE_FIXTURES")
public class ResidenceFixtures implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "RESIDENCE_ID", insertable = false, nullable = false)
    private Integer residenceId;

    @Id
    @Column(name = "FIXTURES_ID", insertable = false, nullable = false)
    private Integer fixturesId;

    
}