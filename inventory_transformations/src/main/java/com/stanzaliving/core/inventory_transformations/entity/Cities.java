package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "cities")
@Data
@Entity
public class Cities implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, nullable = false)
    private Long id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "status")
    private Boolean status = Boolean.FALSE;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "uuid", nullable = false)
    private String uuid;

    @Column(name = "city_name", nullable = false)
    private String cityName;

    @Column(name = "latitude", nullable = false)
    private BigDecimal latitude;

    @Column(name = "longitude", nullable = false)
    private BigDecimal longitude;

    @Column(name = "polygon")
    private String polygon;

    @Column(name = "state_id", nullable = false)
    private Long stateId;

    @Column(name = "city_code")
    private String cityCode;

    @Column(name = "target_beds")
    private Integer targetBeds;

    @Column(name = "target_rooms")
    private Integer targetRooms;

    @Column(name = "core_city_id")
    private Integer coreCityId;

    @Column(name = "core_city_name")
    private String coreCityName;

    
}