package com.stanzaliving.core.generic.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@Getter
public enum TDSSlabs {

    NA("NA",null),
    ZERO("0 %",0.0),
    ZERO_POINT_ONE("0.10 %",0.10),
    ZERO_POINT_ONE_FIVE("0.15 %",0.15),
    ZERO_POINT_SEVEN_FIVE("0.75 %",0.75),
    ZERO_POINT_EIGHT_FIVE("0.85 %",0.85),
    ONE("01 %",1.0),
    ONE_POINT_FIVE("1.50 %",1.50),
    TWO("02 %", 2.0),
    TWO_POINT_SEVEN("2.70 %",2.70),
    THREE("03 %",3.0),
    THREE_POINT_SEVEN_FIVE("3.75 %",3.75),
    FIVE("05 %",5.0),
    SEVEN_POINT_FIVE("7.50 %",7.50),
    TEN("10 %",10.0),
    TWENTY_POINT_EIGHT("20.80 %",20.80);


    private String fieldTypeText;
    private Double tdsPct;


    private static List<TDSSlabs> sortedTdsSlabs = new ArrayList<>();

    static {
        sortedTdsSlabs.add(NA);
        sortedTdsSlabs.add(ZERO);
        sortedTdsSlabs.add(ZERO_POINT_ONE);
        sortedTdsSlabs.add(ZERO_POINT_ONE_FIVE);
        sortedTdsSlabs.add(ZERO_POINT_SEVEN_FIVE);
        sortedTdsSlabs.add(ZERO_POINT_EIGHT_FIVE);
        sortedTdsSlabs.add(ONE);
        sortedTdsSlabs.add(ONE_POINT_FIVE);
        sortedTdsSlabs.add(TWO);
        sortedTdsSlabs.add(TWO_POINT_SEVEN);
        sortedTdsSlabs.add(THREE);
        sortedTdsSlabs.add(THREE_POINT_SEVEN_FIVE);
        sortedTdsSlabs.add(FIVE);
        sortedTdsSlabs.add(SEVEN_POINT_FIVE);
        sortedTdsSlabs.add(TEN);
        sortedTdsSlabs.add(TWENTY_POINT_EIGHT);
    }

    public static List<TDSSlabs> getSortedTdsSlabs(){
        return sortedTdsSlabs;
    }
    public static TDSSlabs getSlab(Double tdsPct){
        for(TDSSlabs tdsSlab :TDSSlabs.values()){
            if(tdsSlab.getTdsPct().equals(tdsPct))
                return tdsSlab;
        }
        return null;
    }

    public static Double getPctOrZero(TDSSlabs slab){
        if(Objects.isNull(slab.getTdsPct()))
            return 0.0;

        return slab.getTdsPct();
    }
}
