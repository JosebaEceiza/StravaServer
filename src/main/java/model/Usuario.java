package model;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {
	
	private String email;
	private String nombre;
	private Date fechaNacimiento;
	private float peso;
	private float altura;
	private int frecuenciaMáxima;
	private int frecuenciaReposo;
	private ArrayList<Reto> retos;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getFrecuenciaMáxima() {
		return frecuenciaMáxima;
	}
	public void setFrecuenciaMáxima(int frecuenciaMáxima) {
		this.frecuenciaMáxima = frecuenciaMáxima;
	}
	public int getFrecuenciaReposo() {
		return frecuenciaReposo;
	}
	public void setFrecuenciaReposo(int frecuenciaReposo) {
		this.frecuenciaReposo = frecuenciaReposo;
	}
	public ArrayList<Reto> getRetos() {
		return retos;
	}
	public void setRetos(ArrayList<Reto> retos) {
		this.retos = retos;
	}
	
	@Override
	public String toString() {
		return "Usuario [email=" + email + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", peso="
				+ peso + ", altura=" + altura + ", frecuenciaMáxima=" + frecuenciaMáxima + ", frecuenciaReposo="
				+ frecuenciaReposo + "]";
	}
}
