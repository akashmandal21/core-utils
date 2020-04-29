package com.stanzaliving.core.inventory_transformations.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PropertyTypeController {
	
	private static final Logger logger = LoggerFactory.getLogger(PropertyTypeController.class);
	@GetMapping(value = "/allProperty")
	public ResponseEntity<List<String>> getResidenceInventory() {
		logger.info("All properties added");
		return new ResponseEntity<List<String>>(PropertyType.getAllPropertyTypes()
				, HttpStatus.OK);
	}
}
