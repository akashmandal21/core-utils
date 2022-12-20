package com.stanzaliving.acl.client.Utils;

import java.util.HashMap;
import java.util.List;

public class ResourceDto {
    HashMap<String,List<String>> resourceAttributeMap;
    HashMap<String,List<String>> resourcePermissionsMap;

    public ResourceDto(){

    }

    public ResourceDto(HashMap<String, List<String>> resourceAttributeMap, HashMap<String, List<String>> resourcePermissionsMap) {
        this.resourceAttributeMap = resourceAttributeMap;
        this.resourcePermissionsMap = resourcePermissionsMap;
    }

    public HashMap<String, List<String>> getResourceAttributeMap() {
        return resourceAttributeMap;
    }

    public HashMap<String, List<String>> getResourcePermissionsMap() {
        return resourcePermissionsMap;
    }

    public void setResourceAttributeMap(HashMap<String, List<String>> resourceAttributeMap) {
        this.resourceAttributeMap = resourceAttributeMap;
    }

    public void setResourcePermissionsMap(HashMap<String, List<String>> resourcePermissionsMap) {
        this.resourcePermissionsMap = resourcePermissionsMap;
    }
}
