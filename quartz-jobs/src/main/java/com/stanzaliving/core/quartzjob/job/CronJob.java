package com.stanzaliving.core.quartzjob.job;

import java.lang.management.ManagementFactory;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.quartz.InterruptableJob;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.quartz.UnableToInterruptJobException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.stanzaliving.core.service.JobService;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CronJob extends QuartzJobBean implements InterruptableJob {

	@Autowired
	private JobService jobService;

	@Override
	protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		JobKey key = jobExecutionContext.getJobDetail().getKey();
		log.info(ManagementFactory.getRuntimeMXBean().getName() + " : " + new Date());
		log.info("Cron Job started with key :" + key.getName() + ", Group :" + key.getGroup() + " , Thread Name :" + Thread.currentThread().getName() + " ,Time now :" + new Date());

		log.info("======================================");
		log.info("Accessing annotation example: " + jobService.getAllJobs());
		List<Map<String, Object>> list = jobService.getAllJobs();
		log.info("Job list :" + list);
		log.info("======================================");

		// *********** For retrieving stored key-value pairs ***********/
		JobDataMap dataMap = jobExecutionContext.getMergedJobDataMap();
		String myValue = dataMap.getString("myKey");
		log.info("Value:" + myValue);

		log.info("Thread: " + Thread.currentThread().getName() + " stopped.");

		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			log.error("", e);
		}

		log.info("waked up");

	}

	@Override
	public void interrupt() throws UnableToInterruptJobException {
		log.info("Stopping thread... ");
	}

}