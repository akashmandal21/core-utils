package com.stanzaliving.analytics.logs.expression;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.stanzaliving.analytics.logs.enums.ExprLang;

public class ReflectionExpressionBuilder implements ExpressionBuilder
{
    
    public ExprLang getName()
    {
        return ExprLang.REFLECT;
    }

    public Expression build(Field field)
    {
        return new ReflectionFieldExpression(field);
    }

    public Expression build(Method method)
    {
        return new ReflectionMethodExpression(method);
    }

}
