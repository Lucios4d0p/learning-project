package com.adopiluv.repository;

import com.adopiluv.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepository extends JpaRepository<Persona, Integer> {


}
