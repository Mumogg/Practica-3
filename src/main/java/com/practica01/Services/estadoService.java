package com.practica01.Services;

import java.util.List;
import com.practica01.domain.Estado;

public interface estadoService {
    //lista registros tabla cliente y coloca en lista de objetos cliente
    public List<Estado> getEstado();
    //obtiene registro de la tabla cliente que tiene el id pasado por el obj
    public Estado getEstado(Estado estado);
    //elimina registro de la tabla cliente que tiene el id pasado por el obj
    public void deleteEstado (Estado estado);
    //se crea si no existe o es nulo se crea nuevo en la tabla
    //si existe se modifica
    public void saveEstado (Estado estado);
}
