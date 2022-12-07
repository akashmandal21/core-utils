package com.stanzaliving.acl.client.annotation;

import com.stanzaliving.acl.client.Permissions;
import com.stanzaliving.acl.client.Utils.AttributeValueProvider;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckPermission {
    String resource();
    String[] permissions();
    Class<? extends AttributeValueProvider> attributeValueProvider();
}
