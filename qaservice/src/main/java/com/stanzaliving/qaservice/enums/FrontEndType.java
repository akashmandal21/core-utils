package com.stanzaliving.qaservice.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public enum FrontEndType {

    UPLOADIMAGE("Upload-Image"), 
    TextField("textField"), 
    TextDateField("textDateField"), 
    TextArea("textArea"),
    SQUAREMULTISELECTBUTTON("Square-Multiselect-Button"), 
    SQUAREINPUTBUTTON("Square-Input-Button"), 
    ROOMQUESTIONCONTAINER("Room-Question-Container"), 
    ROOMLAYOUT("Room-Layout"),
    RECTANGLEMULTISELECTBUTTONHORIZONTALRED("Rectangle-Multiselect-Button-Horizontal-Red"),
    RECTANGLEMULTISELECTBUTTONHORIZONTALGREEN("Rectangle-Multiselect-Button-Horizontal-Green"),
    HIDDEN("hidden"),
    FILTERCOMPONENT("FilterComponent"),
	ELLIPTICALRADIOBUTTON("Elliptical-Radio-Button"),
	DROPDOWN("dropDown"),
	DATEFIELD("dateField"),
	BUILDINGLAYOUT("Building-Layout"),
	SWITCHCARD("Switch-Card"),
    EXPAND_ON_TAP_STAR_RATING("Expand-On-Tap-Start-Rating"),
    HORIZONTAL_MULTISELECT_BUBBLE("Horizontal-Multiselect-Bubble"),
    LINE_CHOICE("Line-Choice"),
    POP_UP_SINGLE_QUESTION("Popup-Single-Choice");
	

    public String frontendType;

    FrontEndType(String frontendType) {
        this.frontendType = frontendType;
    }

}
