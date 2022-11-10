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
import pe.com.escuelanueva.escuelanueva.entity.ParentescoEntity;
import pe.com.escuelanueva.escuelanueva.service.ParentescoService;

@RestController
@RequestMapping("/parentesco")
public class ParentecoController {
    
    @Autowired
    private ParentescoService servicio;
    
    @GetMapping
    public List<ParentescoEntity> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<ParentescoEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ParentescoEntity> findById(@PathVariable Long id){
        
        return servicio.findById(id);
    }
    
    @PostMapping
    public ParentescoEntity add(@RequestBody ParentescoEntity parentesco){
        return servicio.add(parentesco);
    }
    
    @PutMapping("/{id}")
    public ParentescoEntity update(@PathVariable long id, @RequestBody ParentescoEntity parentesco){
        parentesco.setCodigo(id);
        return servicio.update(parentesco);
    }
    
    @DeleteMapping("/{id}")
    public ParentescoEntity delete(@PathVariable long id){
        ParentescoEntity parentescoObj = new ParentescoEntity();
        parentescoObj.setEstado(false);
        return servicio.delete(ParentescoEntity.builder().codigo(id).build());
    }
}
