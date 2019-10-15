package com.stanzaliving.core.quartzjob.job;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.quartz.InterruptableJob;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.quartz.UnableToInterruptJobException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.stanzaliving.core.service.JobService;

public class SimpleJob extends QuartzJobBean implements InterruptableJob {

	private static final Logger logger = Logger.getLogger(SimpleJob.class);

	private volatile boolean toStopFlag = true;

	@Autowired
	private JobService jobService;

	@Override
	protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		JobKey key = jobExecutionContext.getJobDetail().getKey();
		logger.debug("Simple Job started with key :" + key.getName() + ", Group :" + key.getGroup() + " , Thread Name :" + Thread.currentThread().getName());

		logger.debug("======================================");
		logger.debug("Accessing annotation example: " + jobService.getAllJobs());
		List<Map<String, Object>> list = jobService.getAllJobs();
		logger.debug("Job list :" + list);
		logger.debug("======================================");

		// *********** For retrieving stored key-value pairs ***********/
		JobDataMap dataMap = jobExecutionContext.getMergedJobDataMap();
		String myValue = dataMap.getString("myKey");
		logger.debug("Value:" + myValue);

		while (toStopFlag) {
			try {
				logger.debug("Test Job Running... Thread Name :" + Thread.currentThread().getName());
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		logger.debug("Thread: " + Thread.currentThread().getName() + " stopped.");
	}

	@Override
	public void interrupt() throws UnableToInterruptJobException {
		logger.debug("Stopping thread... ");
		toStopFlag = false;
	}

}