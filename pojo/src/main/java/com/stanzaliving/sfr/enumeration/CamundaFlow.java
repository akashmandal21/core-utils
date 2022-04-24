package com.stanzaliving.sfr.enumeration;

import com.stanzaliving.sfr.dto.ModulesDto;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Getter
public enum CamundaFlow {

    ESTATE_FLOW("Estate_flow", "1000"),
    ESTATE_FLOW_2("Estate_flow_2", "1001"),
    ESTATE_FLOW_3("Estate_flow_3","1002");
    private final String name;
    private final String id;

    CamundaFlow(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public static List<ModulesDto> getPgModules() {
        List<ModulesDto> modulesList=new ArrayList<>();
        modulesList.add(new ModulesDto(Module.INITIAL_BED_TEST.getName(), Module.INITIAL_BED_TEST.getUuid()));
        modulesList.add(new ModulesDto(Module.SALES_REVIEW.getName(), Module.SALES_REVIEW.getUuid()));
        modulesList.add(new ModulesDto(Module.LEGAL_DEVIATION.getName(), Module.LEGAL_DEVIATION.getUuid()));
        modulesList.add(new ModulesDto(Module.PROPERTY_NAMING.getName(), Module.PROPERTY_NAMING.getUuid()));
        return modulesList;

    }

    public static List<ModulesDto> getApartmentModules() {
        List<ModulesDto> modulesList=new ArrayList<>();
        modulesList.add(new ModulesDto(Module.LEGAL_DEVIATION.getName(), Module.LEGAL_DEVIATION.getUuid()));
        return modulesList;
    }

    public static List<ModulesDto> getSocietyModules() {
      return Collections.emptyList();
    }
    public static List<CamundaFlow> getCamundaFlow() {
           return new ArrayList<>( Arrays.asList(CamundaFlow.values()));
    }


}
