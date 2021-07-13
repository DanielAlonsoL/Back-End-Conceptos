package com.danielalonso.examen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Clase que implementa la intefaz ConceptoService
 * Dónde se sobreescriben los métodos necesarios
 * @author Daniel Alonso Lopez
 *
 */
@Service
public class ConceptoServiceImp implements ConceptoService{
	@Autowired
	private ConceptoRepositorio conceptoRepositorio;

	/**
	 * Lista todos los conceptos en BD
	 * @return Ejecución del método findAll
	 */
	@Override
	public List<Concepto> listar() {
		return conceptoRepositorio.findAll();
	}

	/**
	 * Busca un concepto por su ID en BD
	 * @return Ejecución del método findById
	 */
	@Override
	public Concepto listarId(int id) {
		return conceptoRepositorio.findById(id);
	}

	/**
	 * Inserta un concepto en BD
	 * @return Ejecución del método save
	 */
	@Override
	public Concepto add(Concepto c) {
		return conceptoRepositorio.save(c);
	}

	/**
	 * Actualiza un registro de concepto en BD
	 * @return Ejecución del método save
	 */
	@Override
	public Concepto edit(Concepto c) {
		return conceptoRepositorio.save(c);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
	}


}
