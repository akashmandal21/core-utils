package com.stanzaliving.core.kafka.web.servlet;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
public class ServletPlugin implements ServletContainerInitializer {

	private static final Logger log = Logger.getLogger(ServletPlugin.class);

	@Override
	public void onStartup(Set<Class<?>> arg0, ServletContext ctx) throws ServletException {
		log.info("ConsumerShutdownServlet Initialized");
		ctx
				.addServlet(ConsumerShutdownServlet.class.getName(), new ConsumerShutdownServlet())
				.addMapping(ConsumerShutdownServlet.URL);
	}

}