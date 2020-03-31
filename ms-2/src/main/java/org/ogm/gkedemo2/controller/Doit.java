package org.ogm.gkedemo2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class Doit {

	private static final Logger logger = LoggerFactory.getLogger(Doit.class);
	@Value("${ms1-endpoint}")
	private String ms1Endpoint = null;
	
	@RequestMapping("/add")
	public ResponseEntity<Integer> add(@RequestParam("first") String first,@RequestParam("second") String second) {
		
		RestTemplate restTemplate = new RestTemplate();
		String resourceUrl = ms1Endpoint+"/add/"+first+"/"+second;
		logger.info(resourceUrl);
		
		ResponseEntity<Integer> response
			  = restTemplate.getForEntity(resourceUrl, Integer.class);
		 return response;
	}
}
