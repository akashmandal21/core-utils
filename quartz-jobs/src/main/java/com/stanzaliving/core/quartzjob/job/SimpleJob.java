package com.stanzaliving.core.quartzjob.job;

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
public class SimpleJob extends QuartzJobBean implements InterruptableJob {

	private volatile boolean toStopFlag = true;

	@Autowired
	private JobService jobService;

	@Override
	protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		JobKey key = jobExecutionContext.getJobDetail().getKey();
		log.debug("Simple Job started with key :" + key.getName() + ", Group :" + key.getGroup() + " , Thread Name :" + Thread.currentThread().getName());

		log.debug("======================================");
		log.debug("Accessing annotation example: " + jobService.getAllJobs());
		List<Map<String, Object>> list = jobService.getAllJobs();
		log.debug("Job list :" + list);
		log.debug("======================================");

		// *********** For retrieving stored key-value pairs ***********/
		JobDataMap dataMap = jobExecutionContext.getMergedJobDataMap();
		String myValue = dataMap.getString("myKey");
		log.debug("Value:" + myValue);

		while (toStopFlag) {
			try {
				log.debug("Test Job Running... Thread Name :" + Thread.currentThread().getName());
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		log.debug("Thread: " + Thread.currentThread().getName() + " stopped.");
	}

	@Override
	public void interrupt() throws UnableToInterruptJobException {
		log.debug("Stopping thread... ");
		toStopFlag = false;
	}

}