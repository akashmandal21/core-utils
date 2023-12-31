/**
 * 
 */
package com.stanzaliving.core.quartzjob.constants;

import lombok.experimental.UtilityClass;

/**
 * 
 * @author naveen
 *
 * @date 30-Sep-2019
 */
@UtilityClass
public class QuartzConstants {

	public static final String INSTANCE_NAME = "org.quartz.scheduler.instanceName";
	public static final String INSTANCE_ID = "org.quartz.scheduler.instanceId";
	public static final String THREAD_COUNT = "org.quartz.threadPool.threadCount";
	public static final String JOB_STORE_CLASS = "org.quartz.jobStore.class";
	public static final String JOB_STORE_DIVER_DELEGATE_CLASS = "org.quartz.jobStore.driverDelegateClass";
	public static final String JOB_STORE_USE_PROPERTIES = "org.quartz.jobStore.useProperties";
	public static final String JOB_STORE_MISFIRE_THRESHOLD = "org.quartz.jobStore.misfireThreshold";
	public static final String JOB_STORE_TABLE_PREFIX = "org.quartz.jobStore.tablePrefix";
	public static final String JOB_STORE_IS_CLUSTERED = "org.quartz.jobStore.isClustered";
	public static final String JOB_STORE_CLUSTER_CHECKIN_INTERVAL = "org.quartz.jobStore.clusterCheckinInterval";
	public static final String SHUTDOWN_HOOK_CLASS = "org.quartz.plugin.shutdownHook.class";
	public static final String SHUTDOWN_HOOK_CLEAN_SHUTDOWN = "org.quartz.plugin.shutdownHook.cleanShutdown";

	public static final String LOCK_HANDLER_CLASS = "org.quartz.jobStore.lockHandler.class";

	public static final String LOCK_HANDLER_MAX_RETRY = "org.quartz.jobStore.lockHandler.maxRetry";

	public static final String LOCK_HANDLER_RETRY_PERIOD = "org.quartz.jobStore.lockHandler.retryPeriod";

}