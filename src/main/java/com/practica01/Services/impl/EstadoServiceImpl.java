package com.practica01.Services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practica01.Dao.estadoDao;
import com.practica01.domain.Estado;
import com.practica01.Services.estadoService;

@Service
public class EstadoServiceImpl implements estadoService{

    @Autowired
    private estadoDao eDao;

    @Override
    public List<Estado> getEstado() {
        return(List<Estado>) eDao.findAll();
    }

    @Override
    public Estado getEstado(Estado estado) {
        return eDao.findById(estado.getId()).orElse(null);
    }

    @Override
    public void deleteEstado(Estado estado) {
        eDao.delete(estado);
    }

    @Override
    public void saveEstado(Estado estado) {
        eDao.save(estado);
    }

    

    
}
