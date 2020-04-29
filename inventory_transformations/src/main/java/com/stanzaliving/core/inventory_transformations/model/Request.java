package com.stanzaliving.core.inventory_transformations.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stanzaliving.inventory.converter.JsonToMapConverter;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import java.util.Date;
import java.util.Map;


@Getter
@Setter
@Entity
@Table(name = "REQUEST")
@NamedQueries({
	  @NamedQuery(name="findAllRequestsByStudentId",
	              query="SELECT req FROM Request req WHERE req.requestedBy = :studentId")
	})
public class Request {

	@Id
	@GeneratedValue
	@Column(name = "REQUEST_ID")
	private int requestID;

	@Column(name = "REQUEST_UNIQUE_ID")
	private String requestUniqueID;

	@Column(name = "REQUEST_TYPE")
	private RequestType requestType;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "BOOKING")
	private Booking booking;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "SERVICE")
	private Service service;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "PRICE_TYPE", nullable = false)
	private PriceType priceType;

	@Column(name = "STATUS")
	private String status;

	@Convert(converter = JsonToMapConverter.class)
    private Map<String, String> metadata;

	@Column(name = "REQUESTED_BY")
	private String requestedBy;

	@Column(name = "CONFIRMATION_DATE")
	private Date confirmationDate;

}
