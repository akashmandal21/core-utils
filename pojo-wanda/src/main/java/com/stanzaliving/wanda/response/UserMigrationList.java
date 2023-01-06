package com.stanzaliving.wanda.response;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.wanda.dtos.BankDetailsDto;
import com.stanzaliving.wanda.dtos.ResidentEmergencyContactDto;
import com.stanzaliving.wanda.dtos.ResidentRelationDto;
import com.stanzaliving.wanda.dtos.UpiDetailsDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class UserMigrationList {

    private List<String> userUuids;
}
