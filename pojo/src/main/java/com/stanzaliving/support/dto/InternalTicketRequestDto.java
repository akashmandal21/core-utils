package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.ventaAudit.enums.DamageAssessed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Map;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class InternalTicketRequestDto {

    private Department department;
    private String residenceUuid;
    private String raisedForUuid;

    @NotBlank(message = "Item /Damage level cannot be blank/null")
    Map<String, String> itemDamageMap;
}
