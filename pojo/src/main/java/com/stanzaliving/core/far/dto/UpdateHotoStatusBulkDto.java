package com.stanzaliving.core.far.dto;

import com.stanzaliving.core.far.enums.HotoStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author dhruv.mathur
 * @date 31/03/21
 */
@Setter
@Getter
public class UpdateHotoStatusBulkDto {
    private List<String> listOfAssets;
    private String addressUuid;
    private HotoStatus hotoStatus;
}
