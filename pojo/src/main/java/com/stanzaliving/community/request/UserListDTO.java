package com.stanzaliving.community.request;

import com.stanzaliving.community.enums.UserList;
import com.stanzaliving.community.validations.ApprovalValidation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserListDTO {
	
    private String uuid;

    @NotNull(message = "Please select User List Type",groups = {ApprovalValidation.class})
    private UserList userListType;

    private EventLocationDTO specificLocation;

    private String userListCsvUrl;
}
