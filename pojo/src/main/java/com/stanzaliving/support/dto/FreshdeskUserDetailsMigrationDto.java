package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreshdeskUserDetailsMigrationDto {

    @JsonSetter(value="uuid")
    private String uuid;

    @JsonSetter(value="user_id")
    private String userId;

    @JsonSetter(value="user_name")
    private String userName;

    @JsonSetter(value="user_email")
    private String userEmail;

    @JsonSetter(value="job_title")
    private String jobTitle;

    @JsonSetter(value="phone_no")
    private String phoneNo;

    @JsonSetter(value="created_by")
    private String createdBy;

    @JsonSetter(value="status")
    private String status;

    @JsonSetter(value="updated_at")
    private String updatedAt;

    @JsonSetter(value="updated_by")
    private String updatedBy;

}
