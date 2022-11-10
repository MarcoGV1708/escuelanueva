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
import pe.com.escuelanueva.escuelanueva.entity.DistritoEntity;
import pe.com.escuelanueva.escuelanueva.service.DistritoService;

@RestController
@RequestMapping("/distrito")
public class DistritoController {
    
    @Autowired
    private DistritoService servicio;
    
    @GetMapping
    public List<DistritoEntity> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<DistritoEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<DistritoEntity> findById(@PathVariable Long id){
        
        return servicio.findById(id);
    }
    
    @PostMapping
    public DistritoEntity add(@RequestBody DistritoEntity distrito){
        return servicio.add(distrito);
    }
    
    @PutMapping("/{id}")
    public DistritoEntity update(@PathVariable long id, @RequestBody DistritoEntity distrito){
        distrito.setCodigo(id);
        return servicio.update(distrito);
    }
    
    @DeleteMapping("/{id}")
    public DistritoEntity delete(@PathVariable long id){
        DistritoEntity distritoObj = new DistritoEntity();
        distritoObj.setEstado(false);
        return servicio.delete(DistritoEntity.builder().codigo(id).build());
    }
}
