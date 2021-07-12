package com.danielalonso.examen;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface ConceptoRepositorio extends Repository<Concepto, Integer> {
	List<Concepto>findAll();
	Concepto findById(int id);
	Concepto save(Concepto c);
	void delete(Concepto c);
}
