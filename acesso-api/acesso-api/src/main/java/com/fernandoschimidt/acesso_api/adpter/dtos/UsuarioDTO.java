package com.fernandoschimidt.acesso_api.adpter.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsuarioDTO {
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private Boolean administrador;

}
