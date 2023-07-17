package com.stanzaliving.analytics.logs.expression;



public interface Expression
{
    static final String DEFAULT_NAME = "defaultName";
    
    String getName();
    
    Object evaluate(Object expr);
}
