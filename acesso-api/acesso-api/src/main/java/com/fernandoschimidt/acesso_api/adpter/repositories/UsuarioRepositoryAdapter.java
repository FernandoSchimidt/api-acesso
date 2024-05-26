package com.fernandoschimidt.acesso_api.adpter.repositories;

import com.fernandoschimidt.acesso_api.adpter.entities.UsuarioEntity;
import com.fernandoschimidt.acesso_api.core.domain.Usuario;
import com.fernandoschimidt.acesso_api.core.ports.UsuarioRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    private final UsuarioRepository usuarioRepository;
    private final ModelMapper modelMapper;

    @Override
    public Usuario create(Usuario usuario) {
        UsuarioEntity entity = modelMapper.map(usuario, UsuarioEntity.class);
        UsuarioEntity novoUsuario = usuarioRepository.save(entity);
        return modelMapper.map(novoUsuario, Usuario.class);
    }
}
