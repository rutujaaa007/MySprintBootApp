package com.example;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 

@RestController
public class HelloController {

	@GetMapping("/")
	public String text() {
		return "Hello world, this is Rutuja";
	}

}
