package com.auth.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.auth.model.entities.Usuario;
import com.auth.repositories.UsuarioRepository;

@Service
public class UsuarioDetailsService implements UserDetailsService {
	
	@Autowired
	UsuarioRepository repo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = repo.findByUsernameFetchAcessos(username);
		if (usuario == null) {
			usuario =  repo.findByUsername(username);
		}
		if (usuario == null) {
			throw new Error ("Usuário não existe.");
		}
		return new UsuarioPrincipal(usuario);
	}
	
}
