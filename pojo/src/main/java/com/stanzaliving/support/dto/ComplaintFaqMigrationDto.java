package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintFaqMigrationDto {

    @JsonSetter(value="id")
    private Long id;

    @JsonSetter(value="uuid")
    private String uuid;

    @JsonSetter(value = "question")
    private String question;

    @JsonSetter(value = "answer")
    private String answer;

    @JsonSetter(value = "sequence_id")
    private Integer sequenceId;

    @JsonSetter(value="created_at")
    private Date createdAt;

    @JsonSetter(value="created_by")
    private String createdBy;

    @JsonSetter(value="status")
    private boolean status;

    @JsonSetter(value="updated_at")
    private Date updatedAt;

    @JsonSetter(value="updated_by")
    private String updatedBy;



}