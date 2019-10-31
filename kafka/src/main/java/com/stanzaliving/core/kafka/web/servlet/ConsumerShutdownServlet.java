package com.stanzaliving.core.kafka.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stanzaliving.core.kafka.consumer.impl.BaseConsumer;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConsumerShutdownServlet extends HttpServlet {

	private static final long serialVersionUID = 2631535195619388374L;

	public static final String URL = "/consumer/shutdown";

	private static final List<String> validIps;

	static {
		validIps = new ArrayList<>();
		validIps.add("127.0.0.1");
		validIps.add("localhost");
		validIps.add("0:0:0:0:0:0:0:1");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		PrintWriter writer = response.getWriter();

		if (validIps.contains(request.getRemoteAddr())) {
			log.info("Request recieved to shutdown consumers");

			String leftAlignFormat = "| %-25s | %-6s | %-39s |%n";

			writer.format("+---------------------------+--------+-----------------------------------------+%n");
			writer.format("| Consumer                  | Status | Exception                               |%n");
			writer.format("+---------------------------+--------+-----------------------------------------+%n");

			log.info(BaseConsumer.getConsumers().size() + " consumers available to shutdown");

			for (int index = 0; index < BaseConsumer.getConsumers().size(); index++) {
				BaseConsumer<?, ?> consumer = BaseConsumer.getConsumers().get(index);
				log.info("Shutdown consumer " + (index + 1) + " started...");

				try {
					Boolean result = consumer.shutdown();
					writer.format(leftAlignFormat, consumer.getClass().getSimpleName(), result, "");
					log.info("Shutdown consumer " + (index + 1) + " complete...");
				} catch (InterruptedException e) {
					log.error("", e);

					writer.format(leftAlignFormat, consumer.getClass().getSimpleName(), "", e.getMessage());
				}
			}
			writer.format("+---------------------------+--------+-----------------------------------------+%n");

		} else {
			writer.println("Invalid Request Source : " + request.getRemoteAddr());
		}
		writer.flush();
		writer.close();
	}
}