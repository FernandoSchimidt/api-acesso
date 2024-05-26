package com.fernandoschimidt.acesso_api.core.ports;

import com.fernandoschimidt.acesso_api.core.domain.Usuario;

public interface UsuarioRepositoryPort {

    Usuario create(Usuario usuario);
}
