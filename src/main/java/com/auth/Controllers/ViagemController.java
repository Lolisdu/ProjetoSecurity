package com.auth.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.model.entities.Viagem;
import com.auth.service.ViagemService;



@RestController
@RequestMapping ("/viagem")
public class ViagemController {
	
	@Autowired
	ViagemService viagemService;
	
	@GetMapping
	public List<Viagem> list() {
		return viagemService.listAll();
		
	}

}
