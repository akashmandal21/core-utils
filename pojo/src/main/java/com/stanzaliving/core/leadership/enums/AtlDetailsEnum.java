package com.stanzaliving.core.leadership.enums;

import com.stanzaliving.core.estate.constants.AttributeNames;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AtlDetailsEnum {

    //This enum can be kept in table as well, depending upon whether defaultDuration, scopeDefinitionKey, remarksKey, orderNum or defaultScopeDefinition needs to be modifiable
    STRUCTURE_INTEGRITY_AMENDMENTS("Structure", "(Lease Term)", AttributeNames.STRUCTURE_CLAUSE_A_TEXT_AREA, AttributeNames.STRUCTURE_REMARKS, "Implementing any amendment based on the structural integrity check carried out by Lessee");

    private String item;

    private String defaultDuration;

    private String scopeDefinitionKey;

    private String remarksKey;

    //private Integer orderNum;       //not required, as enums are already sorted by ordinal

    private String defaultScopeDefinition;

}
