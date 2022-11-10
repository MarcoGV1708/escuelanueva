package pe.com.escuelanueva.escuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.escuelanueva.escuelanueva.entity.ParentescoEntity;

public interface ParentescoService {

    List<ParentescoEntity> findAll();

    List<ParentescoEntity> findAllCustom();

    Optional<ParentescoEntity> findById(Long id);

    ParentescoEntity add(ParentescoEntity d);

    ParentescoEntity update(ParentescoEntity d);

    ParentescoEntity delete(ParentescoEntity d);

}
