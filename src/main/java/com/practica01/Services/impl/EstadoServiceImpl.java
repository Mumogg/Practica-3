/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.Services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practica01.Dao.estadoDao;
import com.practica01.domain.Estado;
import com.practica01.Services.estadoService;

@Service
public class EstadoServiceImpl {

    @Autowired
    private estadoDao eDao;

    public estadoDao geteDao() {
        return eDao;
    }

    public void seteDao(estadoDao eDao) {
        this.eDao = eDao;
    }

    
}
