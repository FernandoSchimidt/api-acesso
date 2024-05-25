package com.fernandoschimidt.acesso_api.adpter.controller;

import com.fernandoschimidt.acesso_api.adpter.dtos.UsuarioDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {

    @PostMapping
    public ResponseEntity<UsuarioDTO> create(@RequestBody UsuarioDTO usuarioDTO){

        return new ResponseEntity<>(usuarioDTO,HttpStatus.CREATED);
    }
}
