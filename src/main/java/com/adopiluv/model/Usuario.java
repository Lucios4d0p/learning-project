package com.adopiluv.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    @Id
    private int id;
    private String nome;
    private String clave;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
