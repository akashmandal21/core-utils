package com.stanzaliving.core.user.enums;

import java.util.HashSet;
import java.util.Set;

public enum App {

    SIGMA,
    ALFRED,
    NUCLEUS,
    NEXUS,
    NUCLEUSX;

    public static Set<App> appsEligibleForUserSessionCheck(){
        Set<App> appSet = new HashSet<>();
        appSet.add(SIGMA);
        appSet.add(ALFRED);
        appSet.add(NEXUS);
        appSet.add(NUCLEUS);
        appSet.add(NUCLEUSX);
        return appSet;
    }

    public static Set<App> appsEligibleForDeviceIdCheck(){
        Set<App> appSet = new HashSet<>();
        appSet.add(SIGMA);
        appSet.add(ALFRED);
        appSet.add(NEXUS);
        return appSet;
    }

}
