package com.stanzaliving.acl.client.annotation;


import com.stanzaliving.acl.client.enums.AttributeType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
public @interface Attribute {
    AttributeType type();
}
