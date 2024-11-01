package model;

import java.time.ZonedDateTime;
import java.util.Date;

public class Reto {

	
	private Usuario creador;
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private float distancia;
	private ZonedDateTime tiempoObjetivo;
	private String deporte;
	public Usuario getCreador() {
		return creador;
	}
	public void setCreador(Usuario creador) {
		this.creador = creador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public float getDistancia() {
		return distancia;
	}
	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}
	public ZonedDateTime getTiempoObjetivo() {
		return tiempoObjetivo;
	}
	public void setTiempoObjetivo(ZonedDateTime tiempoObjetivo) {
		this.tiempoObjetivo = tiempoObjetivo;
	}
	public String getDeporte() {
		return deporte;
	}
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	@Override
	public String toString() {
		return "Reto [creador=" + creador + ", nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", distancia=" + distancia + ", tiempoObjetivo=" + tiempoObjetivo + ", deporte=" + deporte
				+ "]";
	}
	
	
}
