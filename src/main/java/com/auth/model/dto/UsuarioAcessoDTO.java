package com.auth.model.dto;

import java.util.List;


public class UsuarioAcessoDTO {
 private static Long IdUser;
 private List<Long> IdsAcesso;
 
 
public static Long getIdUser() {
	return IdUser;
}
public void setIdUser(Long idUser) {
	IdUser = idUser;
}
public List<Long> getIdsAcesso() {
	return IdsAcesso;
}
public void setIdsAcesso(List<Long> idsAcesso) {
	IdsAcesso = idsAcesso;
}

public UsuarioAcessoDTO(Long idUser, List<Long> idsAcesso) {
	super();
	IdUser = idUser;
	IdsAcesso = idsAcesso;
}
 
 
 
}
