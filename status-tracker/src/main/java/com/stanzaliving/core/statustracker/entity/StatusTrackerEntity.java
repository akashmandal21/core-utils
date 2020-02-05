/**
 * 
 */
package com.stanzaliving.core.statustracker.entity;

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


@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "status_tracker")
@Entity(name = "status_tracker")
public class StatusTrackerEntity extends AbstractJpaEntity {

	private static final long serialVersionUID = 158088134914261446L;

	@Column(name = "context_name", columnDefinition = "varchar(255)", nullable = false)
	private String contextName;

	@Column(name = "status", nullable = false)
	private String status;

	@Column(name = "context_uuid", columnDefinition = "varchar(255)", nullable = false)
	private String contextUuid;
	
}