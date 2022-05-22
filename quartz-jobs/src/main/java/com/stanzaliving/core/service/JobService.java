package com.stanzaliving.core.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.quartz.JobDataMap;
import org.springframework.scheduling.quartz.QuartzJobBean;

public interface JobService {

	boolean scheduleOneTimeJob(String jobName, String groupKey, Class<? extends QuartzJobBean> jobClass, Date date, JobDataMap jobDataMap, boolean isRecoverable);

	boolean scheduleOneTimeJobWithIgnoreMisfirePolicy(String jobName, String groupKey, Class<? extends QuartzJobBean> jobClass, Date date, JobDataMap jobDataMap, boolean isRecoverable, boolean isDurable);

	boolean scheduleCronJob(String jobName, String groupName, Class<? extends QuartzJobBean> jobClass, Date date, String cronExpression, String timezone, JobDataMap jobDataMap, boolean isRecoverable);

	boolean updateOneTimeJob(String jobName, Date date);

	boolean updateCronJob(String jobName, Date date, String cronExpression, String timezone);

	boolean unScheduleJob(String jobName);

	boolean deleteJob(String jobName, String groupKey);

	boolean pauseJob(String jobName, String groupKey);

	boolean resumeJob(String jobName, String groupKey);

	boolean startJobNow(String jobName, String groupKey);

	boolean isJobRunning(String jobName, String groupKey);

	List<Map<String, Object>> getAllJobs();

	boolean isJobWithNamePresent(String jobName, String groupKey);

	String getJobState(String jobName, String groupKey);

	boolean stopJob(String jobName, String groupKey);
}