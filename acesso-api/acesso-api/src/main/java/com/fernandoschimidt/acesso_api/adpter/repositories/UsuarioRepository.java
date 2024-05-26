package com.fernandoschimidt.acesso_api.adpter.repositories;

import com.fernandoschimidt.acesso_api.adpter.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
