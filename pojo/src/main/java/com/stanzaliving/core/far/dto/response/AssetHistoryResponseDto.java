package com.stanzaliving.core.far.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

import com.stanzaliving.core.far.enums.AssetActionType;

/**
 * @author dhruv.mathur
 * @date 05/04/21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssetHistoryResponseDto {
    private String assetUuid;
    private String assetHistoryUuid;
    private String contextDescription;
    private List<UpdatedFieldsDto> updatedFields;
    private String doneBy;
    private Date lastUpdatedOn;
    private String assetActionType;
    private String assetActionName;
}
