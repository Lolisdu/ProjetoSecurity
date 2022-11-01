package com.auth.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.auth.model.entities.Usuario;
import com.auth.repositories.UsuarioRepository;
import com.auth.service.UsuarioService;


@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioRepository userRepository;
	
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Override
	public Usuario save(Usuario usuario) {
		Usuario existsUsuario = userRepository.findByUsername(usuario.getNome());
		if (existsUsuario != null) {
			throw new Error ("Usuário existente.");
		}
		
		usuario.setSenha(passwordEncoder().encode(usuario.getSenha()));
		
		Usuario usuarioCriado = userRepository.save(usuario);
		return usuarioCriado;
	}


	
}
