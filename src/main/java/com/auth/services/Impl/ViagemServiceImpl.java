package com.auth.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.model.entities.Viagem;
import com.auth.repositories.ViagemRepository;
import com.auth.service.ViagemService;



@Service
public class ViagemServiceImpl implements ViagemService {

	@Autowired
	ViagemRepository postRepository;
	
	@Override
	public List<Viagem> listAll() {
		
		return postRepository.findAll();
	}

}
