package com.MundoVerde.CultivoManager.Cultivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.MundoVerde.CultivoManager.Cultivo.entity.Usuario;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{   
    Optional<Usuario> findByEmail(String email);
 }