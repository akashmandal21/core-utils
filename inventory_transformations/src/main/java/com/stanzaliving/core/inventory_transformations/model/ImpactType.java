package com.stanzaliving.core.inventory_transformations.model;

import java.util.HashMap;
import java.util.Map;

public enum ImpactType {

    NO_IMPACT {
        public int getImpactTypeId() {
            return 0;
        }
    }, REVENUE {
        public int getImpactTypeId() {
            return 1;
        }
    },
    CAC {
        public int getImpactTypeId() {
            return 2;
        }
    };
    private static Map<Integer, ImpactType> idToImpactTypeMap = new HashMap<>();

    static {
        idToImpactTypeMap.put(NO_IMPACT.getImpactTypeId(), NO_IMPACT);
        idToImpactTypeMap.put(REVENUE.getImpactTypeId(), REVENUE);
        idToImpactTypeMap.put(CAC.getImpactTypeId(), CAC);
    }

    public static ImpactType getImpactType(Integer id) {
        return idToImpactTypeMap.get(id);
    }

    public abstract int getImpactTypeId();
}
