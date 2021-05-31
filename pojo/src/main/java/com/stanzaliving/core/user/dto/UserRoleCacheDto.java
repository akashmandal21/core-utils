package com.stanzaliving.core.user.dto;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.*;

import java.util.List;
import java.util.Map;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class UserRoleCacheDto {

    @EqualsAndHashCode.Include
    private String roleName;
    @EqualsAndHashCode.Include
    private Department department;
    @EqualsAndHashCode.Exclude
    private Map<String, List<UIKeyValue>> accessUserMap;
}
