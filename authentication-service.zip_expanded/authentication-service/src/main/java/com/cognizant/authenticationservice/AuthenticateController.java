package com.cognizant.authenticationservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/authenticate")
public class AuthenticateController {

	@GetMapping("/{number}")
	public String getLoanByNumber(@PathVariable String number) {
		return "Hello"+number;
	}
}
