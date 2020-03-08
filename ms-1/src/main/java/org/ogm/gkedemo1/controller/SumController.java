package org.ogm.gkedemo1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class SumController {

	@RequestMapping("/add/{first}/{second}")
	public ResponseEntity<Integer> sayHello(@PathVariable("first") String first,@PathVariable("second") String second) {
		Integer value = Integer.valueOf(first) + Integer.valueOf(second);
		 return new ResponseEntity<Integer>(value, HttpStatus.OK);
	}
}
