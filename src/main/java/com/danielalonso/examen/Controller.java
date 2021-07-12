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

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/conceptos"})
public class Controller {
	@Autowired
	ConceptoService service;
	
	@GetMapping
	public List<Concepto>listar(){
		return service.listar();
	}
	
	@PostMapping
	public Concepto agregar(@RequestBody Concepto c) {
		return service.add(c);
	}
	
	@GetMapping(path = {"/{id}"})
	public Concepto listarId(@PathVariable("id") int id) {
		return service.listarId(id);
	}
	
	@PutMapping(path = {"/{id}"})
	public Concepto editar(@RequestBody Concepto c, @PathVariable("id")int id) {
		c.setId(id);
		return service.edit(c);
	}
}
