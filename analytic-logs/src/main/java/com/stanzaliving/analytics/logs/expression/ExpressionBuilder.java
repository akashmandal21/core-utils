package com.stanzaliving.analytics.logs.expression;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.stanzaliving.analytics.logs.enums.ExprLang;


public interface ExpressionBuilder
{
    ExprLang getName();
    
    Expression build(Field field);
    
    Expression build(Method method);
}
