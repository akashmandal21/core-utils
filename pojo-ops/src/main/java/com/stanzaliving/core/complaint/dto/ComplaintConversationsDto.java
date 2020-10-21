package com.stanzaliving.core.complaint.dto;

import com.stanzaliving.core.complaint.enums.ComplaintConversationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ComplaintConversationsDto {

    private ComplaintConversationType complaintConversationType;

    private String body;

    private String bodyText;

    private String attachmentName;

    private String attachmentType;

    private String attachmentPath;

    private String attachmentBucket;

    private Date createdAt;

    private String createdAtText;

}
