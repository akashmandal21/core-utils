package com.stanzaliving.analytics.logs.service;

import java.lang.Thread.UncaughtExceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AnalyticChainingUncaughtExceptionHandler implements UncaughtExceptionHandler
{
    private static final Logger LOG = LoggerFactory.getLogger(AnalyticChainingUncaughtExceptionHandler.class);
    private UncaughtExceptionHandler previousHandler;
    
    public AnalyticChainingUncaughtExceptionHandler(UncaughtExceptionHandler previousHandler){
        this.previousHandler = previousHandler;
    }

    public void uncaughtException(Thread t, Throwable e)
    {
        LOG.trace("testing uncaught Exception thread");
        if (previousHandler != null){
            previousHandler.uncaughtException(t, e);
        }
        AnalyticContextInterface.endGracefully(t, e);
    }

}
