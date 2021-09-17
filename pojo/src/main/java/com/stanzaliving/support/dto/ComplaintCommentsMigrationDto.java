package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintCommentsMigrationDto {

    @JsonSetter(value="comment")
    private String comment;

    @JsonSetter(value="private_msg")
    private String privateMsg;


}
