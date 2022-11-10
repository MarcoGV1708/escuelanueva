package pe.com.escuelanueva.escuelanueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.escuelanueva.escuelanueva.entity.ParentescoEntity;
import pe.com.escuelanueva.escuelanueva.repository.ParentescoRepository;

@Service
public class ParentescoServiceImp implements ParentescoService {

    @Autowired
    private ParentescoRepository repositorioparentesco;

    @Override
    public List<ParentescoEntity> findAll() {
        return repositorioparentesco.findAll();
    }

    @Override
    public List<ParentescoEntity> findAllCustom() {
        return repositorioparentesco.findAllCustom();
    }

    @Override
    public Optional<ParentescoEntity> findById(Long id) {
        return repositorioparentesco.findById(id);
    }

    @Override
    public ParentescoEntity add(ParentescoEntity p) {
        return repositorioparentesco.save(p);
    }

    @Override
    public ParentescoEntity update(ParentescoEntity p) {
        ParentescoEntity objparentesco = repositorioparentesco.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objparentesco);
        return repositorioparentesco.save(objparentesco);
    }

    @Override
    public ParentescoEntity delete(ParentescoEntity p) {
        ParentescoEntity objparentesco = repositorioparentesco.getById(p.getCodigo());
        objparentesco.setEstado(false);
        return repositorioparentesco.save(objparentesco);
    }
}
