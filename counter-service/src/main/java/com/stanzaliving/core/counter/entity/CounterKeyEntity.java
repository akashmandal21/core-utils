package com.stanzaliving.core.counter.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity(name = "counter_key")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "counter_key")
public class CounterKeyEntity extends AbstractJpaEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "category_key")
	private String key;
	
	@Column(name = "count")
	private Long count;
}
