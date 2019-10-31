package com.stanzaliving.core.quartzjob.example;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.quartz.JobDataMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.format.annotation.DateTimeFormat;

import com.stanzaliving.core.quartzjob.job.CronJob;
import com.stanzaliving.core.quartzjob.job.SimpleJob;
import com.stanzaliving.core.service.JobService;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Examples {

	@Autowired
	@Lazy
	private JobService jobService;

	public void schedule(String jobName, String groupName,
			@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm") Date jobScheduleTime,
			String cronExpression, String timeZone) {
		log.info("JobController.schedule()");

		if (!jobService.isJobWithNamePresent(jobName, groupName)) {
			JobDataMap dataMap = new JobDataMap();
			boolean isRecoverable = true;
			if (cronExpression == null || cronExpression.trim().equals("")) {
				// Single Trigger
				jobService.scheduleOneTimeJob(jobName, groupName, SimpleJob.class, jobScheduleTime, dataMap, isRecoverable);
			} else {
				// Cron Trigger
				jobService.scheduleCronJob(jobName, groupName, CronJob.class, jobScheduleTime, cronExpression, timeZone, dataMap, isRecoverable);
			}
		}
	}

	public void unschedule(String jobName) {
		log.info("JobController.unschedule()");
		jobService.unScheduleJob(jobName);
	}

	public void delete(String jobName, String groupName) {
		log.info("JobController.delete()");

		if (jobService.isJobWithNamePresent(jobName, groupName)) {
			boolean isJobRunning = jobService.isJobRunning(jobName, groupName);

			if (!isJobRunning) {
				jobService.deleteJob(jobName, groupName);

			}
		}
	}

	public void pause(String jobName, String groupName) {
		log.info("JobController.pause()");

		if (jobService.isJobWithNamePresent(jobName, groupName)) {

			boolean isJobRunning = jobService.isJobRunning(jobName, groupName);

			if (!isJobRunning) {
				jobService.pauseJob(jobName, groupName);
			}
		}
	}

	public void resume(String jobName, String groupName) {
		log.info("JobController.resume()");

		if (jobService.isJobWithNamePresent(jobName, groupName)) {
			String jobState = jobService.getJobState(jobName, groupName);

			if (jobState.equals("PAUSED")) {
				log.info("Job current state is PAUSED, Resuming job...");
				jobService.resumeJob(jobName, groupName);
			}
		}
	}

	public void updateJob(String jobName, String groupName,
			@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm") Date jobScheduleTime,
			String cronExpression, String timeZone) {
		log.info("JobController.updateJob()");

		// Edit Job
		if (jobService.isJobWithNamePresent(jobName, groupName)) {

			if (cronExpression == null || cronExpression.trim().equals("")) {
				// Single Trigger
				jobService.updateOneTimeJob(jobName, jobScheduleTime);
			} else {
				// Cron Trigger
				jobService.updateCronJob(jobName, jobScheduleTime, cronExpression, timeZone);
			}
		}
	}

	public List<Map<String, Object>> getAllJobs() {
		log.info("JobController.getAllJobs()");
		return jobService.getAllJobs();
	}

	public boolean checkJobName(String jobName, String groupName) {
		log.info("JobController.checkJobName()");

		return jobService.isJobWithNamePresent(jobName, groupName);
	}

	public boolean isJobRunning(String jobName, String groupName) {
		log.info("JobController.isJobRunning()");

		return jobService.isJobRunning(jobName, groupName);
	}

	public String getJobState(String jobName, String groupName) {
		log.info("JobController.getJobState()");

		return jobService.getJobState(jobName, groupName);
	}

	public void stopJob(String jobName, String groupName) {
		log.info("JobController.stopJob()");

		if (jobService.isJobWithNamePresent(jobName, groupName) && jobService.isJobRunning(jobName, groupName)) {
			jobService.stopJob(jobName, groupName);
		}
	}

	public void startJobNow(String jobName, String groupName) {
		log.info("JobController.startJobNow()");

		if (jobService.isJobWithNamePresent(jobName, groupName) && !jobService.isJobRunning(jobName, groupName)) {
			jobService.startJobNow(jobName, groupName);
		}
	}
}