package com.stanzaliving.analytics.logs;

import com.stanzaliving.analytics.logs.annotations.AnalyseTransaction;
import com.stanzaliving.analytics.logs.service.AnalyticService;
import org.junit.Test;



public class AnnotatedMembersTest extends BaseTest
{    
    @Test
    public void test()
    {
        AnalyticService.init();
        transactionalMethod();
        
    }
    
    @AnalyseTransaction(name = "testTransaction")
    public void transactionalMethod()
    {
        AnalyticService.update(annotatedMembersBean);
        AnalyticService.update("randomKey", "randomValue");
    }

}
