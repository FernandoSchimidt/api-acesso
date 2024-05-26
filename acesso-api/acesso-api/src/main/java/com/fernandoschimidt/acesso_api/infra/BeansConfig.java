package com.fernandoschimidt.acesso_api.infra;

import com.fernandoschimidt.acesso_api.core.ports.UsuarioRepositoryPort;
import com.fernandoschimidt.acesso_api.core.ports.UsuarioServicePort;
import com.fernandoschimidt.acesso_api.core.services.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public UsuarioServicePort usuarioServiceImpl(UsuarioRepositoryPort usuarioRepositoryPort) {
        return new UsuarioService(usuarioRepositoryPort);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
