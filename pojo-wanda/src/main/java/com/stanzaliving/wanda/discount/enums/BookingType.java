package com.stanzaliving.wanda.discount.enums;

public enum BookingType {

    ALL("All" , 0)
    , B2B("B2B" , 1)
    , B2C_NEW_CLOSURES("B2C-new closures" , 2)
    , B2C_RETENTION("B2C-Retention" , 3);

    String name;
    int value;

    private BookingType(String name, int value) {
        this.name = name;
        this.value = value;
    }
    public String getName() {
        return name;
    }

}