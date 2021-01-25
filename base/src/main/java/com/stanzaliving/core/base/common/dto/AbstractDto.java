package com.stanzaliving.core.base.common.dto;

import java.io.Serializable;
import java.util.Date;

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
public abstract class AbstractDto implements Serializable {

	private static final long serialVersionUID = 1635296868115644218L;

	protected Long id;

	protected String uuid;

	protected Date createdAt;

	protected String createdBy;

	protected Date updatedAt;

	protected String updatedBy;

	protected Boolean status;

}