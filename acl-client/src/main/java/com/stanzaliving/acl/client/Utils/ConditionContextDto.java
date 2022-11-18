package com.stanzaliving.acl.client.Utils;


import com.stanzaliving.acl.client.AttributeDto;
import com.stanzaliving.acl.client.Permissions;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;


public class ConditionContextDto implements Serializable {
    private String resource;
    private List<Permissions> permissions;
    private HashMap<String,Object> attributeValues;
    private String userId;

    public ConditionContextDto(){

    }


    public ConditionContextDto(String resource,List<Permissions> permissions,HashMap<String,Object> attributeValues,String userId){
        this.resource=resource;
        this.attributeValues=attributeValues;
        this.permissions=permissions;
        this.userId=userId;
    }

    public String getResource() {
        return resource;
    }

    public List<Permissions> getPermissions() {
        return permissions;
    }

    public HashMap<String,Object> getAttributeValues() {
        return attributeValues;
    }

    public String getUserId() {
        return userId;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public void setPermissions(List<Permissions> permissions) {
        this.permissions = permissions;
    }

    public void setAttributeValues(HashMap<String,Object> attributeValues) {
        this.attributeValues = attributeValues;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
