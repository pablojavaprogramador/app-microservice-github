package com.mitocode.model;

public class Estudiante {

	private Long id;

	private String apellidos;

	private String nombres;

	private int edad;

	public Estudiante() {
		super();
	}

	public Estudiante(Long id, String apellidos, String nombres, int edad) {
		super();
		this.id = id;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
