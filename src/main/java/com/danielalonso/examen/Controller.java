package com.danielalonso.examen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Clase que comunica al front end
 * Manejando la ruta de /conceptos y sus métodos de peticion HTTP
 * @author Daniel Alonso Lopez
 * @version 1.0, 12/07/2021
 */
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/conceptos"})
public class Controller {
	@Autowired
	ConceptoService service;
	
	/**
	 * Obtiene todos los conceptos que están en BD
	 * @return Llamada al método listar del servicio
	 */
	@GetMapping
	public List<Concepto>listar(){
		return service.listar();
	}
	
	/**
	 * Agrega a la BD un concepto
	 * @param {Concepto} c - Objeto de tipo Concepto
	 * @return Llamada al método add del servicio
	 */
	@PostMapping
	public Concepto agregar(@RequestBody Concepto c) {
		return service.add(c);
	}
	
	/**
	 * Busca un concepto de acuerdo a su ID (PK)
	 * @param {int} id del concepto a buscar
	 * @return Llamada al método listadId del servicio
	 */
	@GetMapping(path = {"/{id}"})
	public Concepto listarId(@PathVariable("id") int id) {
		return service.listarId(id);
	}
	
	/**
	 * Edita un concepto de acuerdo a su ID (PK)
	 * @param {Concepto} c - Objeto de tipo Concepto
	 * @param {int} id del concepto a editar
	 * @return
	 */
	@PutMapping(path = {"/{id}"})
	public Concepto editar(@RequestBody Concepto c, @PathVariable("id")int id) {
		c.setId(id);
		return service.edit(c);
	}
}
