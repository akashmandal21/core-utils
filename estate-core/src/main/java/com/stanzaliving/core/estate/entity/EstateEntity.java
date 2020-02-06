/**
 * 
 */
package com.stanzaliving.core.estate.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.stanzaliving.core.estate.enums.EstateStatus;
import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;
import com.stanzaliving.core.sqljpa.entity.AddressEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 30-Oct-2019
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "estate",uniqueConstraints = @UniqueConstraint(columnNames = "estate_name"))
@Entity(name = "estate")
public class EstateEntity extends AbstractJpaEntity {

	private static final long serialVersionUID = 158088134914261446L;

	@Column(name = "estate_name", columnDefinition = "varchar(255)", nullable = false)
	private String estateName;

	@Embedded
	private AddressEntity address;

	@Column(name = "city_id", nullable = false)
	private Long cityId;

	@Column(name = "micromarket_id", nullable = false)
	private Long micromarketId;

	@Column(name = "lat", nullable = false)
	private Double lat;

	@Column(name = "lon", nullable = false)
	private Double lon;

	@Enumerated(EnumType.STRING)
	@Column(name = "estate_status", nullable = false)
	private EstateStatus estateStatus;

	@Column(name = "estate_code", columnDefinition = "varchar(15)", nullable = false)
	private String estateCode;

	 @Column(name = "property_name", columnDefinition = "varchar(255)")
	 private String propertyName;
}