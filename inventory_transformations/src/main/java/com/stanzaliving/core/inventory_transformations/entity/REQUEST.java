package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Table(name = "REQUEST")
@Entity
public class REQUEST implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "REQUEST_ID", nullable = false)
    private Integer requestId;

    @Column(name = "REQUEST_UNIQUE_ID")
    private String requestUniqueId;

    @Column(name = "REQUEST_TYPE")
    private String requestType;

    @Column(name = "BOOKING")
    private Integer BOOKING;

    @Column(name = "SERVICE")
    private Integer SERVICE;

    @Column(name = "PRICE", nullable = false)
    private Double PRICE;

    @Column(name = "STATUS")
    private String STATUS;

    @Column(name = "PRICE_TYPE")
    private Integer priceType;

    @Column(name = "METADATA")
    private String METADATA;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "REQUESTED_BY")
    private String requestedBy;

    @Column(name = "ROOM_NUMBER")
    private String roomNumber;

    @Column(name = "CONFIRMATION_DATE")
    private LocalDateTime confirmationDate;

    
}