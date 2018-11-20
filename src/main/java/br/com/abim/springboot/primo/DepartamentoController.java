package br.com.abim.springboot.primo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/Departamentos"})
public class DepartamentoController {

	    @Autowired
	    private DepartamentoService departamentoServiceImpl;

	    @PostMapping
	    public Departamento create(@RequestBody Departamento Departamento){
	        return departamentoServiceImpl.create(Departamento);
	    }

	    @GetMapping(path = {"/{id}"})
	    public Departamento findOne(@PathVariable("id") Long id){
	        return departamentoServiceImpl.findById(id);
	    }

	    @PutMapping(path = {"/{id}"})
	    public Departamento update(@PathVariable("id") Long id, @RequestBody Departamento Departamento){
	        Departamento.setId(id);
	        return departamentoServiceImpl.create(Departamento);
	    }

	    @DeleteMapping(path ={"/{id}"})
	    public Departamento delete(@PathVariable("id") Long id) {
	        return departamentoServiceImpl.delete(id);
	    }

	    @GetMapping
	    public List<Departamento> findAll(){
	        return departamentoServiceImpl.findAll();
	    }


}
