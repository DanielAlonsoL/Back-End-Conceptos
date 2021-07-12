package com.danielalonso.examen;

import java.util.List;

public interface ConceptoService {
	List<Concepto>listar();
	Concepto listarId(int id);
	Concepto add(Concepto c);
	Concepto edit(Concepto c);
	void delete(int id);
}
