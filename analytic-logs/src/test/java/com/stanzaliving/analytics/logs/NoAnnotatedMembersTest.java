package com.stanzaliving.analytics.logs;

import com.stanzaliving.analytics.logs.annotations.AnalyseTransaction;
import com.stanzaliving.analytics.logs.service.AnalyticService;
import org.junit.Test;


public class NoAnnotatedMembersTest extends BaseTest
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
        AnalyticService.update(noAnnotatedMembersBean);
        AnalyticService.update("randomKey", "randomValue");
    }

}
