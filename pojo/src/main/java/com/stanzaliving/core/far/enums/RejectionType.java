package com.stanzaliving.core.far.enums;

/**
 * @author dhruv.mathur
 * @date 23/03/21
 */
public enum RejectionType {
    DAMAGED("Damaged"), OTHER("Other");

    private String label;

    RejectionType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
