package com.stanzaliving.wanda.discount.enums;

public enum PropertyType {
    ALL("All"), SUITS("Suits"), SCHOLAR("Scholar");

    private String name;

    private PropertyType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
