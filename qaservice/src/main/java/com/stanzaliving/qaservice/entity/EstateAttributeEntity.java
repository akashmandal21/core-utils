/**
 * 
 */
package com.stanzaliving.qaservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 31-Oct-2019
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "estate_attributes")
@Entity(name = "estate_attributes")
public class EstateAttributeEntity extends AbstractJpaEntity {

	private static final long serialVersionUID = 4593720606601882570L;

	@Column(name = "estate_id", columnDefinition = "char(40) NOT NULL")
	private String estateId;

	@Column(name = "property_id", columnDefinition = "char(40) NOT NULL")
	private String propertyId;
	
	@Column(name = "attribute_name", columnDefinition = "varchar(255) NOT NULL")
	private String attributeName;

	@Column(name = "attribute_value", columnDefinition = "MEDIUMTEXT")
	private String attributeValue;
	
}