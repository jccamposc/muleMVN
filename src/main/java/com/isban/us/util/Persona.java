/**
 * 
 */
package com.isban.us.util;

/**
 * @author Z782868
 *
 */
public class Persona {
	
	/**
	 * var.
	 */
	private String nombre;
	
	/**
	 * var.
	 */
	private String apellido;
	
	/**
	 * var.
	 */
	private String edad;
	
	
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public Persona(String nombre, String apellido, String edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the edad
	 */
	public String getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	
	
	

}
