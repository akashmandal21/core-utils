package com.stanzaliving.estate_v2.enumeration;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public enum CamundaFlow {

    ALPHA("Alpha", "1000"),
    BETA("Beta", "1001");

    private final String name;
    private final String id;

    CamundaFlow(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public static List<String> getAlphaModules() {
       return new ArrayList<>(Arrays.asList("Initial Bed Test","Sales Review","Legal Deviations","Property Naming"));
    }

    public static List<String> getBetaModules() {
        return new ArrayList<>(Arrays.asList("Sales Review","Legal Deviations","Property Naming"));
    }

    public static List<CamundaFlow> getCamundaFlow() {
           return new ArrayList<>( Arrays.asList(CamundaFlow.values()));
    }


}
