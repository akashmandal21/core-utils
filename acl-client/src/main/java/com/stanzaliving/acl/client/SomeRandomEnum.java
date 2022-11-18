package com.stanzaliving.acl.client;

import java.util.List;

public enum SomeRandomEnum {
    Value1(new String[]{"x1", "x2"},new String[]{"perm1","perm2"});
    String[] values;
    String[] perms;
    SomeRandomEnum(String[] values,String[] perms){
        this.values=values;
        this.perms=perms;
    }
}
