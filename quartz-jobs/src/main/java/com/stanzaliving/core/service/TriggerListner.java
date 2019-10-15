package com.stanzaliving.core.service;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.Trigger;
import org.quartz.Trigger.CompletedExecutionInstruction;
import org.quartz.TriggerListener;

public class TriggerListner implements TriggerListener {

	private static final Logger logger = Logger.getLogger(TriggerListner.class);

	@Override
	public String getName() {
		return "globalTrigger";
	}

	@Override
	public void triggerFired(Trigger trigger, JobExecutionContext context) {
		logger.debug("TriggerListner.triggerFired()");
	}

	@Override
	public boolean vetoJobExecution(Trigger trigger, JobExecutionContext context) {
		logger.debug("TriggerListner.vetoJobExecution()");
		return false;
	}

	@Override
	public void triggerMisfired(Trigger trigger) {
		logger.debug("TriggerListner.triggerMisfired()");
		String jobName = trigger.getJobKey().getName();
		logger.debug("Job name: " + jobName + " is misfired");

	}

	@Override
	public void triggerComplete(Trigger trigger, JobExecutionContext context, CompletedExecutionInstruction triggerInstructionCode) {
		logger.debug("TriggerListner.triggerComplete()");
	}
}