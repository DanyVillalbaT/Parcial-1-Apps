package com.daniela.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mueble {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	private String material;
	private String color;
	private String textura;
	private double altura;
	private double ancho;
	private int cantPatas;
	
	public Mueble() {
		super();
	}

	public Mueble(int id, String nombre, String material, String color, String textura, double altura, double ancho,
			int cantPatas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.material = material;
		this.color = color;
		this.textura = textura;
		this.altura = altura;
		this.ancho = ancho;
		this.cantPatas = cantPatas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTextura() {
		return textura;
	}

	public void setTextura(String textura) {
		this.textura = textura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public int getCantPatas() {
		return cantPatas;
	}

	public void setCantPatas(int cantPatas) {
		this.cantPatas = cantPatas;
	}
	
}
