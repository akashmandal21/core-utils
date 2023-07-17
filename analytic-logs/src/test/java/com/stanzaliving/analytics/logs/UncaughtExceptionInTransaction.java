package com.stanzaliving.analytics.logs;

import com.stanzaliving.analytics.logs.annotations.AnalyseTransaction;
import com.stanzaliving.analytics.logs.service.AnalyticService;
import org.junit.Test;


public class UncaughtExceptionInTransaction extends BaseTest
{

    @Test
    public void test() throws InterruptedException
    {
        AnalyticService.init();

        Thread t = new Thread(new Runnable() {

            @Override
            public void run()
            {
                transactionalMethod();
            }
        });
        t.start();
        t.join();
    }

    @AnalyseTransaction(name = "testTransaction")
    public void transactionalMethod()
    {
        AnalyticService.update(annotatedMembersBean);
        AnalyticService.update(noAnnotatedMembersBean);
        throw new RuntimeException();
    }

}
