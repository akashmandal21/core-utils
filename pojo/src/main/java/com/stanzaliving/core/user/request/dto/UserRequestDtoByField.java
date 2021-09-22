package com.stanzaliving.core.user.request.dto;


import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDtoByField {

    List<String> userIds;
    boolean active;
    String fieldsRequested;
}
