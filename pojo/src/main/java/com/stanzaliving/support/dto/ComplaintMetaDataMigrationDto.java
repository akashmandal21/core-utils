package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintMetaDataMigrationDto {

    @JsonSetter(value="uuid")
    private String complaintUuid;

    @JsonSetter(value="cms_id")
    private String cmsId;

    @JsonSetter(value="user_id")
    private String userId;

    @JsonSetter(value="complaint_type_uuid")
    private String complaintTypeUuid;

    @JsonSetter(value="complaint_category_uuid")
    private String complaintCategoryUuid;

    @JsonSetter(value="complaint_sub_category_uuid")
    private String complaintSubCategoryUuid;

    @JsonSetter(value="complaint_status")
    private String complaintStatus;

    @JsonSetter(value="description")
    private String description;

    @JsonSetter(value="hostel_id")
    private String hostelId;

    @JsonSetter(value="hostel_name")
    private String hostelName;

    @JsonSetter(value="room_no")
    private String roomNo;

    @JsonSetter(value="subject")
    private String subject;

    @JsonSetter(value="user_name")
    private String userName;

    @JsonSetter(value="user_mobile_no")
    private String userMobileNo;

    @JsonSetter(value="user_email")
    private String userEmail;

    @JsonSetter(value="user_type")
    private String userType;

    @JsonSetter(value="ticket_agent_name")
    private String ticketAgentName;

    @JsonSetter(value="ticket_agent_email")
    private String ticketAgentEmail;

    @JsonSetter(value="closed_at")
    private Date closedAt;

    @JsonSetter(value="closed_on_comment")
    private String closedOnComment;

    @JsonSetter(value="satisfied")
    private boolean satisfied;

    @JsonSetter(value="resolved_at")
    private Date resolvedAt;

    @JsonSetter(value="resolved_on_comment")
    private String resolvedOnComment;

    @JsonSetter(value="ticket_of_user_id")
    private String ticketOfUserId;

    @JsonSetter(value="created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @JsonSetter(value="created_by")
    private String createdBy;

    @JsonSetter(value="status")
    private boolean status;

    @JsonSetter(value="updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @JsonSetter(value="updated_by")
    private String updatedBy;

    @JsonSetter(value="priority")
    private String priority;

    @JsonSetter(value="feedback_time")
    private String feedbackTime;


}
