package com.danielalonso.examen;

import java.util.List;

import org.springframework.data.repository.Repository;

/**
 * Intefaz que extiende de Repository
 * Se definen los métodos que se deben sobreescribir
 * Como lo es findAll, findById, save y delete
 * @author Daniel Alonso Lopez
 *
 */
public interface ConceptoRepositorio extends Repository<Concepto, Integer> {
	List<Concepto>findAll();
	Concepto findById(int id);
	Concepto save(Concepto c);
	void delete(Concepto c);
}
