package pe.com.escuelanueva.escuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.escuelanueva.escuelanueva.entity.DistritoEntity;

public interface DistritoService {

    //funcion para mostrar todos los distritos
    List<DistritoEntity> findAll();

    //funcion para mostrar los distritos habilitados
    List<DistritoEntity> findAllCustom();

    //funcion para buscar un distrito por codigo
    Optional<DistritoEntity> findById(Long id);

    //funcion para registrar
    DistritoEntity add(DistritoEntity d);

    //funcion para actualizar
    DistritoEntity update(DistritoEntity d);

    //funcion para eliminar
    DistritoEntity delete(DistritoEntity d);

}
