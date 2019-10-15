package com.stanzaliving.core.quartzjob.job;

import java.lang.management.ManagementFactory;
import java.util.Date;
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

public class CronJob extends QuartzJobBean implements InterruptableJob {

	private static final Logger logger = Logger.getLogger(CronJob.class);

	@Autowired
	private JobService jobService;

	@Override
	protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		JobKey key = jobExecutionContext.getJobDetail().getKey();
		logger.info(ManagementFactory.getRuntimeMXBean().getName() + " : " + new Date());
		logger.info("Cron Job started with key :" + key.getName() + ", Group :" + key.getGroup() + " , Thread Name :" + Thread.currentThread().getName() + " ,Time now :" + new Date());

		logger.info("======================================");
		logger.info("Accessing annotation example: " + jobService.getAllJobs());
		List<Map<String, Object>> list = jobService.getAllJobs();
		logger.info("Job list :" + list);
		logger.info("======================================");

		// *********** For retrieving stored key-value pairs ***********/
		JobDataMap dataMap = jobExecutionContext.getMergedJobDataMap();
		String myValue = dataMap.getString("myKey");
		logger.info("Value:" + myValue);

		logger.info("Thread: " + Thread.currentThread().getName() + " stopped.");

		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			logger.error("", e);
		}

		logger.info("waked up");

	}

	@Override
	public void interrupt() throws UnableToInterruptJobException {
		logger.info("Stopping thread... ");
	}

}