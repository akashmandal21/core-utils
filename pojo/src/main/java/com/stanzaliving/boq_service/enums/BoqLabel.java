package com.stanzaliving.boq_service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public enum BoqLabel {
    CAPEX("Capex"),
    OPEX("Opex"),
    NA("NA"); // not to be used while labeling. (only used to tag legacy boqs)

    private final String boqLabelText;

    public static List<BoqLabel> getAllLabels() {
        return Arrays.stream(BoqLabel.values())
                .filter(boqLabel -> !boqLabel.equals(BoqLabel.NA))
                .collect(Collectors.toList());
    }
}
