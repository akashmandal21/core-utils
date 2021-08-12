package com.stanzaliving.estate_v2.enumeration;

import com.stanzaliving.estate_v2.dto.ModulesDto;
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

    public static List<ModulesDto> getAlphaModules() {
        List<ModulesDto> modulesList=new ArrayList<>();
        modulesList.add(new ModulesDto(Module.INITIAL_BED_TEST.getName(),Module.INITIAL_BED_TEST.getUuid()));
        modulesList.add(new ModulesDto(Module.SALES_REVIEW.getName(),Module.SALES_REVIEW.getUuid()));
        modulesList.add(new ModulesDto(Module.LEGAL_DEVIATION.getName(),Module.LEGAL_DEVIATION.getUuid()));
        modulesList.add(new ModulesDto(Module.PROPERTY_NAMING.getName(),Module.PROPERTY_NAMING.getUuid()));
        return modulesList;

    }

    public static List<ModulesDto> getBetaModules() {
        List<ModulesDto> modulesList=new ArrayList<>();
        modulesList.add(new ModulesDto(Module.SALES_REVIEW.getName(),Module.SALES_REVIEW.getUuid()));
        modulesList.add(new ModulesDto(Module.LEGAL_DEVIATION.getName(),Module.LEGAL_DEVIATION.getUuid()));
        modulesList.add(new ModulesDto(Module.PROPERTY_NAMING.getName(),Module.PROPERTY_NAMING.getUuid()));
        return modulesList;
    }

    public static List<CamundaFlow> getCamundaFlow() {
           return new ArrayList<>( Arrays.asList(CamundaFlow.values()));
    }


}
