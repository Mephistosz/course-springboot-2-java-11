package com.fgn.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class Teste {

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> vitinho() {

		return ResponseEntity.ok().body("teste vitinho - o que você escutou?");

	}
}
