package com.danielalonso.examen;

import java.util.List;

/**
 * Interfaz que define los métodos a sobreescribir
 * Como lo es listar, listarId, add, edit y delete
 * @author Daniel Alonso Lopez
 *
 */
public interface ConceptoService {
	List<Concepto>listar();
	Concepto listarId(int id);
	Concepto add(Concepto c);
	Concepto edit(Concepto c);
	void delete(int id);
}
