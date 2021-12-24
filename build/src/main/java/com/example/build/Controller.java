package com.example.build;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/{name}")
	public String method(@PathVariable("name") String name) {
		return "hey hi, "+name+"hope you are feeling good !!!";
	}

}
