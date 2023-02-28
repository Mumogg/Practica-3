package com.practica01.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practica01.domain.Estado;

public interface estadoDao extends JpaRepository<Estado,Long>{
    
}
