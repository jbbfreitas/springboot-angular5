package br.com.abim.springboot.primo;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface DepartamentoRepository extends Repository<Departamento, Long> {

	void delete(Departamento dept);

	List<Departamento> findAll();

	Departamento findOne(Long id);

	Departamento save(Departamento dept);

}
