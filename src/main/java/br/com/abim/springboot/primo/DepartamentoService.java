package br.com.abim.springboot.primo;

import java.util.List;

public interface DepartamentoService {

    Departamento create(Departamento Departamento);

    Departamento delete(Long id);

    List<Departamento> findAll();

    Departamento findById(Long id);

    Departamento update(Departamento Departamento);
}
