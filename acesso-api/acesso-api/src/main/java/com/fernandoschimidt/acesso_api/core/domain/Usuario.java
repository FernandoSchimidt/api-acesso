package com.fernandoschimidt.acesso_api.core.domain;

public class Usuario {

    private Long id;
    private String email;
    private String senha;
    private Boolean administrador;
    private Long idPessoa;

    public Usuario() {
    }

    public Usuario(Long id, String email, String senha, Boolean administrador) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String password) {
        this.senha = password;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
