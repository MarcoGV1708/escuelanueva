package pe.com.escuelanueva.escuelanueva.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.escuelanueva.escuelanueva.entity.ApoderadoEntity;
import pe.com.escuelanueva.escuelanueva.service.ApoderadoService;

@RestController
@RequestMapping("/apoderado")
public class ApoderadoController {
    
    @Autowired
    private ApoderadoService servicio;
    
    @GetMapping
    public List<ApoderadoEntity> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<ApoderadoEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ApoderadoEntity> findById(@PathVariable Long id){
        
        return servicio.findById(id);
    }
    
    @PostMapping
    public ApoderadoEntity add(@RequestBody ApoderadoEntity apoderado){
        return servicio.add(apoderado);
    }
    
    @PutMapping("/{id}")
    public ApoderadoEntity update(@PathVariable long id, @RequestBody ApoderadoEntity apoderado){
        apoderado.setCodigo(id);
        return servicio.update(apoderado);
    }
    
    @DeleteMapping("/{id}")
    public ApoderadoEntity delete(@PathVariable long id){
        ApoderadoEntity apoderadoObj = new ApoderadoEntity();
        apoderadoObj.setEstado(false);
        return servicio.delete(ApoderadoEntity.builder().codigo(id).build());
    }
}
