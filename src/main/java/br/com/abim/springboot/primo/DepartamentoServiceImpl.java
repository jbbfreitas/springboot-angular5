package br.com.abim.springboot.primo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    private DepartamentoRepository repository;

    @Override
    public Departamento create(Departamento dept) {
        return repository.save(dept);
    }

    @Override
    public Departamento delete(Long id) {
        Departamento dept = findById(id);
        if(dept != null){
            repository.delete(dept);
        }
        return dept;
    }

    @Override
    public List<Departamento> findAll() {
        return repository.findAll();
    }

    @Override
    public Departamento findById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Departamento update(Departamento dept) {
        return repository.save(dept);
    }

	
}
