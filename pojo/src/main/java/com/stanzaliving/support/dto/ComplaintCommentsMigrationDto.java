package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintCommentsMigrationDto {

    @JsonSetter(value="id")
    private Long id;

    @JsonSetter(value="uuid")
    private String uuid;

    @JsonSetter(value="cms_id")
    private Long cmsId;

    @JsonSetter(value="freshdesk_user_id")
    private String freshdeskUserId;

    @JsonSetter(value="comment")
    private String comment;

    @JsonSetter(value="incoming")
    private String incoming;

    @JsonSetter(value="private_msg")
    private boolean privateMsg;

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
