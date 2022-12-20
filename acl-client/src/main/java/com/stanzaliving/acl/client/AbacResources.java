package com.stanzaliving.acl.client;

import java.util.Map;

public class AbacResources {
    public static Map resourceAttributeMap;

    public static Map resourcePermissionMap;

    static {
        resourceAttributeMap = java.util.stream.Stream.of(
                  new java.util.AbstractMap.SimpleEntry<String, java.util.List<String>>("Phoenix",java.util.Arrays.asList("propertyUuid|TEXT","moduleName|TEXT","parentId|NUMBER"))
                ).collect(java.util.stream.Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        resourcePermissionMap = java.util.stream.Stream.of(
                  new java.util.AbstractMap.SimpleEntry<String, java.util.List<String>>("Phoenix",java.util.Arrays.asList("phoenix_perm1_Phoenix","pheonix_perm2_Phoenix","phoenix_perm3_Phoenix"))
                ).collect(java.util.stream.Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
