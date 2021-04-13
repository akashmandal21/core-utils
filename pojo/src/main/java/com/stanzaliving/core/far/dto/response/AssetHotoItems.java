package com.stanzaliving.core.far.dto.response;

import com.stanzaliving.core.utilservice.annotations.Range;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author dhruv.mathur
 * @date 23/03/21
 */
@Getter
@Setter
@SuperBuilder
public class AssetHotoItems {
    private String itemCode;
    private String itemName;
    private int countOfAssets ;
    private List<AssetBaseDetails> listOfAssets;
}
