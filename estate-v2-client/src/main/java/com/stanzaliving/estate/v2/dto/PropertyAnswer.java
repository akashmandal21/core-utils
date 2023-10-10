package com.stanzaliving.estate.v2.dto;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PropertyAnswer {
  private String propertyUuid;
  private String questionUuid;
  private String variableName;
  private List<String> answers;
  private List<String> imageUrls;
  private Remarks remarks;
  private HashMap<String, Boolean> approval;
  protected String id;
  protected String uuid;
  protected Date createdAt;
  protected String createdBy;
  protected Date updatedAt;
  protected String updatedBy;
  @Builder.Default
  protected boolean status = true;

}
