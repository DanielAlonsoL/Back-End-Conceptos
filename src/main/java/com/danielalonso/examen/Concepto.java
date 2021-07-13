package com.danielalonso.examen;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que define los atributos de un Concepto
 * Así como los getters y setters respectivamente
 * @author Daniel Alonso Lopez
 */
@Entity
@Table(name="concepto")
public class Concepto {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String descripcion;

	@Column
	private String metodoPago;


	@Column
	private int importe;
	
	/**
	 * Obtiene el importe
	 * @return importe
	 */
	public int getImporte() {
		return importe;
	}

	/**
	 * Asigna el importe
	 * @param importe a asignar
	 */
	public void setImporte(int importe) {
		this.importe = importe;
	}

	/**
	 * Obtiene el id
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Asigna el id
	 * @param id a asignar
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Obtiene la descripción
	 * @return descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Asigna la descripcion
	 * @param descripcion a asignar
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Obtiene el metodo de pago
	 * @return metodo de pago
	 */
	public String getMetodoPago() {
		return metodoPago;
	}

	/**
	 * Asigna el metodo de pago
	 * @param metodoPago a asignar
	 */
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	
}
