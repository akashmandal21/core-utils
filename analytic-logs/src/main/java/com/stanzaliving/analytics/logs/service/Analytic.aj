package com.stanzaliving.analytics.logs.service;

import com.stanzaliving.analytics.logs.annotations.AnalyseTransaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public aspect Analytic
{
    private static final Logger log = LoggerFactory.getLogger(Analytic.class);
    
    pointcut transaction(AnalyseTransaction transaction) : execution(@AnalyseTransaction * *.*(..)) && @annotation(transaction);
    
    before(AnalyseTransaction transaction) : transaction(transaction) {
        log.trace("Before transaction");
        AnalyticService.start(transaction.name());
    }
    
    after(AnalyseTransaction transaction) returning() : transaction(transaction) {
        log.trace("after returning transaction");
        AnalyticService.end();
    }
    
    after(AnalyseTransaction transaction) throwing(Throwable th) : transaction(transaction) {
        log.trace("after returning throwing transaction", th);
        AnalyticService.end(th);
    }
}
