package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "REQUEST")
@Data
public class RequestEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "REQUEST_ID", nullable = false)
	@JsonProperty("REQUEST_ID")
    private Integer requestId;

    @Column(name = "REQUEST_UNIQUE_ID")
	@JsonProperty("REQUEST_UNIQUE_ID")
    private String requestUniqueId;

    @Column(name = "REQUEST_TYPE")
	@JsonProperty("REQUEST_TYPE")
    private String requestType;

    @Column(name = "BOOKING")
	@JsonProperty("BOOKING")
    private Integer BOOKING;

    @Column(name = "SERVICE")
	@JsonProperty("SERVICE")
    private Integer SERVICE;

    @Column(name = "PRICE", nullable = false)
	@JsonProperty("PRICE")
    private Double PRICE;

    @Column(name = "STATUS")
	@JsonProperty("STATUS")
    private String STATUS;

    @Column(name = "PRICE_TYPE")
	@JsonProperty("PRICE_TYPE")
    private Integer priceType;

    @Column(name = "METADATA", columnDefinition = "json")
	@JsonProperty("METADATA")
    private String METADATA;

    @Column(name = "CREATED_AT")
	@JsonProperty("CREATED_AT")
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
	@JsonProperty("UPDATED_AT")
    private Timestamp updatedAt;

    @Column(name = "REQUESTED_BY")
	@JsonProperty("REQUESTED_BY")
    private String requestedBy;

    @Column(name = "ROOM_NUMBER")
	@JsonProperty("ROOM_NUMBER")
    private String roomNumber;

    @Column(name = "CONFIRMATION_DATE")
	@JsonProperty("CONFIRMATION_DATE")
    private Timestamp confirmationDate;

    
}