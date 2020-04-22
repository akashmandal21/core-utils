package com.stanzaliving.core.phoenix.embeddedInfos;

import com.stanzaliving.core.user.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PropertyResponsibleInfo {
    String userUuid;
    Integer numAccess=0;
//    String name;
//    String emailId;
//    String mobile;
}

