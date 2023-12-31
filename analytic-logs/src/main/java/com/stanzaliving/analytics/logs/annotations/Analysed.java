package com.stanzaliving.analytics.logs.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.stanzaliving.analytics.logs.enums.ExprLang;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Analysed
{
    String name() default "defaultName";
    String expr() default "defaultExpr";
    ExprLang lang() default ExprLang.REFLECT;
}
