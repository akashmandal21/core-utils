package com.stanzaliving.core.kafka.web.servlet;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
@Lazy(false)
public class ServletPlugin implements ServletContainerInitializer {

	@Override
	public void onStartup(Set<Class<?>> arg0, ServletContext ctx) throws ServletException {
		log.info("ConsumerShutdownServlet Initialized");
		ctx.addServlet(ConsumerShutdownServlet.class.getName(), new ConsumerShutdownServlet())
				.addMapping(ConsumerShutdownServlet.URL);
	}

}