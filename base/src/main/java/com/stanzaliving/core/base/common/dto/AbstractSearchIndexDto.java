package com.stanzaliving.core.base.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractSearchIndexDto implements Serializable {

	private static final long serialVersionUID = 1635296868115644218L;

	protected Long id;

	protected String uuid;

	protected Boolean status;

	protected Date createdAt;

	protected Date updatedAt;

	protected String createdBy;

	protected String updatedBy;

}
