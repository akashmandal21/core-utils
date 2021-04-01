package com.stanzaliving.core.filix;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.item_master.enums.CostHead;
import lombok.*;

import java.util.List;

/**
 * @author dhruv.mathur
 * @date 01/04/21
 */
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemFilixIntegrationDto {
    @JsonProperty("itemid")
    private String itemUuid;

    @JsonProperty("displayname")
    private String itemName;

    @JsonProperty("custitem_xxflx_cost_head")
    private String costHead;

    @JsonProperty("custitem_xxflx_gst_per")
    private String igst;

    @JsonProperty("custitem_xxflx_pack_of_base_item_name")
    private String  baseItem;

    @JsonProperty("custitem_xxflx_specification_document")
    private String specDocument;

    @JsonProperty("custitem_xxflx_item_length")
    private String itemLength;

    @JsonProperty("custitem_xxflx_breadth")
    private String itemBreadth;

    @JsonProperty("custitem_xxflx_item_height")
    private String itemHeight;

    @JsonProperty("custitem_xxflx_item_length_unit")
    private String lengthUnit;

    @JsonProperty("custitem_xxflx_item_breadth_unit")
    private String breadthUnit;

    @JsonProperty("custitem_xxflx_item_height_unit")
    private String heightUnit;

    @JsonProperty("custitem_xxflx_item_colour")
    private String itemColor;

    @JsonProperty("custitem_xxflx_item_image")
    private String itemImage;

    @JsonProperty("custitem_xxflx_consumption_type")
    private String consumptionType;

    @JsonProperty("custitem_xxflx_item_brand")
    private String itemBrand;

    @JsonProperty("custitem_xxflx_item_model")
    private String itemModel;

    @JsonProperty("custitem_xxflx_sl_brand")
    private String slBrand;

    @JsonProperty("custitem_xxflx_sl_sub_brand")
    private String slSubBrand;

    @JsonProperty("custitem_xxflx_usage_type_area")
    private String usageTypeArea;

    @JsonProperty("custitem_xxflx_stanzaitemid")
    private String itemCode;



}
