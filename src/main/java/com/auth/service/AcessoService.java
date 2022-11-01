package com.auth.service;

import com.auth.model.dto.UsuarioAcessoDTO;
import com.auth.model.entities.Usuario;

public interface AcessoService {
	
	Usuario save(UsuarioAcessoDTO usuarioAcessoDTO);
}
