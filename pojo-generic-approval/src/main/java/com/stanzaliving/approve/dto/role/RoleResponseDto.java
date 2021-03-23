package com.stanzaliving.approve.dto.role;

import lombok.*;

@Data
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleResponseDto {

    private Long id;

    private String roleUUID;

    private String roleName;
}
