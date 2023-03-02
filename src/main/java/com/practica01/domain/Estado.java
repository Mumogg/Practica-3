package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")
public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String poblacion;
    private String nombrestado;
    private String capital;
    private String costas;
    
    public Estado() {
    }

    public Estado(String poblacion, String nombrestado, String capital, String costas) {
        this.poblacion = poblacion;
        this.nombrestado = nombrestado;
        this.capital = capital;
        this.costas = costas;
    }
    
}
