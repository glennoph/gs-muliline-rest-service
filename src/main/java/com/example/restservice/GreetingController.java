package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value("${app.name.default}")
	private  String dftName;

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	GreetingProps greetingProps;

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "dft") String name) {

		return new Greeting(counter.incrementAndGet(), String.format(template,
				//dftName
				//GreetingConstants.dftNameConst2  // static constants do not work
				//greetingProps.getVar1()  // this works
				greetingProps.getMultiline()
				));
	}
}
