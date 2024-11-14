package com.adopiluv.repository;

import com.adopiluv.model.Persona;
import com.adopiluv.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {


}
