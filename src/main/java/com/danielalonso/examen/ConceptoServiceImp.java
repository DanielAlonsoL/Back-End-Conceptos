package com.danielalonso.examen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConceptoServiceImp implements ConceptoService{
	@Autowired
	private ConceptoRepositorio conceptoRepositorio;

	@Override
	public List<Concepto> listar() {
		return conceptoRepositorio.findAll();
	}

	@Override
	public Concepto listarId(int id) {
		return conceptoRepositorio.findById(id);
	}

	@Override
	public Concepto add(Concepto c) {
		return conceptoRepositorio.save(c);
	}

	@Override
	public Concepto edit(Concepto c) {
		return conceptoRepositorio.save(c);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
	}


}
