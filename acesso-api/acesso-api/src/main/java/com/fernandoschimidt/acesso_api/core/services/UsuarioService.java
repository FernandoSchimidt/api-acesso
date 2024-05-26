package com.fernandoschimidt.acesso_api.core.services;

import com.fernandoschimidt.acesso_api.core.domain.Usuario;
import com.fernandoschimidt.acesso_api.core.ports.UsuarioRepositoryPort;
import com.fernandoschimidt.acesso_api.core.ports.UsuarioServicePort;

public class UsuarioService implements UsuarioServicePort {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public UsuarioService(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepositoryPort.create(usuario);
    }
}
