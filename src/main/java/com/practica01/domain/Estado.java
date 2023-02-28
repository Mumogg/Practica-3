package com.practica01.domain;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEstado;

    private String poblacion;
    private String nomEstado;
    private String capital;
    private String costas;
    
    public Estado() {
    }

    public Estado(String poblacion, String nomEstado, String capital, String costas) {
        this.poblacion = poblacion;
        this.nomEstado = nomEstado;
        this.capital = capital;
        this.costas = costas;
    }
    
}
