package com.stanzaliving.acl.client.annotation;


import com.stanzaliving.acl.client.Utils.AttributeValueProvider;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Resource {
    String name();
    String[] permissions() default {};
}
