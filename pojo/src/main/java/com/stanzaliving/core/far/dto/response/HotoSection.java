package com.stanzaliving.core.far.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author dhruv.mathur
 * @date 23/03/21
 */
@Setter
@Getter
public class HotoSection {
    private List <AssetHotoItems> stanzaAssets;
    private List <AssetHotoItems> landlordAssets;
    private String message;

}
