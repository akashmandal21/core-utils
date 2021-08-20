package com.stanzaliving.core.far.dto.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author dhruv.mathur
 * @date 23/03/21
 */
@Data
@Setter
@Getter
@SuperBuilder
public class HotoSection {
    private List <AssetHotoItems> stanzaAssets;
    private List <AssetHotoItems> landlordAssets;
    private String message;

}
