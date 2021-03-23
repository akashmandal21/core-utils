package com.stanzaliving.core.far.dto.response;

import com.stanzaliving.core.utilservice.annotations.Range;

import java.util.List;

/**
 * @author dhruv.mathur
 * @date 23/03/21
 */
public class AssetHotoItems {
    private String itemCode;
    private String itemName;
    private int numberOfAssets ;
    private List<AssetBaseDetails> listOfAssets;
}
