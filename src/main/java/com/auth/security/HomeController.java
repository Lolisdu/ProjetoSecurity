package com.auth.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class HomeController {

	@GetMapping ("/home")
	public String home() {
		return "Hello";
	}
	
	@PreAuthorize("hasRole ('USUARIO')")
	@GetMapping ("/usuario")
	public String usuario() {
		return "Hello Usuario!";
	}
	
	@PreAuthorize("hasRole ('ADMIN')")
	@GetMapping ("/Admin")
	public String admin() {
		return "Hello Admin!";
	}
}
