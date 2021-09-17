package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintFaqMigrationDto {

    @JsonSetter(value = "question")
    private String question;

    @JsonSetter(value = "answer")
    private String answer;

    @JsonSetter(value = "sequence_id")
    private String sequenceId;



}