package com.stanzaliving.website.dto.ui;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
@JsonIgnoreProperties({ "sequenceId", "filterType" })
public class FilterUIDto extends FilterComponentUIDto {

}
