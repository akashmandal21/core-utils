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
	@JsonProperty("request_id")
    private Integer requestId;

    @Column(name = "REQUEST_UNIQUE_ID")
	@JsonProperty("request_unique_id")
    private String requestUniqueId;

    @Column(name = "REQUEST_TYPE")
	@JsonProperty("request_type")
    private String requestType;

    @Column(name = "BOOKING")
	@JsonProperty("booking")
    private Integer BOOKING;

    @Column(name = "SERVICE")
	@JsonProperty("service")
    private Integer SERVICE;

    @Column(name = "PRICE", nullable = false)
	@JsonProperty("price")
    private Double PRICE;

    @Column(name = "STATUS")
	@JsonProperty("status")
    private String STATUS;

    @Column(name = "PRICE_TYPE")
	@JsonProperty("price_type")
    private Integer priceType;

    @Column(name = "METADATA", columnDefinition = "json")
	@JsonProperty("metadata")
    private String METADATA;

    @Column(name = "CREATED_AT")
	@JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
	@JsonProperty("updated_at")
    private Timestamp updatedAt;

    @Column(name = "REQUESTED_BY")
	@JsonProperty("requested_by")
    private String requestedBy;

    @Column(name = "ROOM_NUMBER")
	@JsonProperty("room_number")
    private String roomNumber;

    @Column(name = "CONFIRMATION_DATE")
	@JsonProperty("confirmation_date")
    private Timestamp confirmationDate;

    
}