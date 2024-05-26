package com.fernandoschimidt.acesso_api.adpter.converters;

import com.fernandoschimidt.acesso_api.adpter.dtos.UsuarioDTO;
import com.fernandoschimidt.acesso_api.core.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {

    public Usuario toDomain(UsuarioDTO usuarioDTO) {
        return new Usuario(usuarioDTO.getId(), usuarioDTO.getEmail(), usuarioDTO.getSenha(), usuarioDTO.getAdministrador());
    }

    public UsuarioDTO toDTO(Usuario usuario) {
        return new UsuarioDTO(usuario.getId(), null, usuario.getEmail(), usuario.getSenha(), usuario.getAdministrador());
    }
}
