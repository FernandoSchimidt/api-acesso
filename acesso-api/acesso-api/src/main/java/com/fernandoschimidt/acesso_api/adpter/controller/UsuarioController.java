package com.fernandoschimidt.acesso_api.adpter.controller;

import com.fernandoschimidt.acesso_api.adpter.converters.UsuarioConverter;
import com.fernandoschimidt.acesso_api.adpter.dtos.UsuarioDTO;
import com.fernandoschimidt.acesso_api.core.domain.Usuario;
import com.fernandoschimidt.acesso_api.core.ports.UsuarioServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioServicePort usuarioServicePort;
    private final UsuarioConverter usuarioConverter;

    @PostMapping
    public ResponseEntity<UsuarioDTO> create(@RequestBody UsuarioDTO usuarioDTO) {
        Usuario novoUsuario = usuarioServicePort.createUsuario(usuarioConverter.toDomain(usuarioDTO));
        return new ResponseEntity<>(usuarioConverter.toDTO(novoUsuario), HttpStatus.CREATED);
    }
}
