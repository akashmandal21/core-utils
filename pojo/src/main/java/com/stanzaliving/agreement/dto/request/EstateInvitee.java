package com.stanzaliving.agreement.dto.request;

import com.stanzaliving.legal_v2.DTO.Document.AadhaarConfig;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class EstateInvitee {
    private String name;
    private String email;
    private String phone;
    private String groupId;
    private String groupName;
    private String completionThreshold;
    private String organizationName;
    private AadhaarConfig aadhaarConfig;
    private String expiryDate;
    private String signUrl;
    private String active;
}
