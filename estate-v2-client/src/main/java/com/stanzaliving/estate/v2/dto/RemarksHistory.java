package com.stanzaliving.estate.v2.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemarksHistory {

  private String remarks;

  private String type;

  private String id;

  private String uuid;

  private Date createdAt;

  private String createdBy;

  private Date updatedAt;

  private String updatedBy;

  @Builder.Default
  private boolean status = true;
}
