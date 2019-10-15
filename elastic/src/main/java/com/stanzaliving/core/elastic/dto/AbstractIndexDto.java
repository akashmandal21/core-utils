package com.stanzaliving.core.elastic.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Service
@AllArgsConstructor
public abstract class AbstractIndexDto {

	@Id
	@Field(type = FieldType.Keyword)
	protected String id;

	@Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:mm:ss")
	protected String createdAt;

	@Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:mm:ss")
	protected String updatedAt;

	protected String createdBy;
	protected String updatedBy;
	protected Boolean status;

	public AbstractIndexDto() {
		super();
	}

	public AbstractIndexDto(String id, String createdAt, String updatedAt, String updatedBy, Boolean status) {
		super();
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.status = status;
	}

}