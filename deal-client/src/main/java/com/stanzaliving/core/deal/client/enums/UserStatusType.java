package com.stanzaliving.core.deal.client.enums;

public enum UserStatusType {
    IN_PROGRESS("IN_PROGRESS",0),NOT_ONBOARDED("NOT_ONBOARDED",1),ONBOARDED("ONBOARDED",2),MOVED_OUT("MOVED_OUT",3);
    
	String name;
    int value;

    private UserStatusType(String name, int value) {
        this.name = name;
        this.value = value;
    }
    public String getName() {
        return name;
    }    
}