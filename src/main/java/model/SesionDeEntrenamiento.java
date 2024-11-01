package model;

import java.time.ZonedDateTime;
import java.util.Date;

public class SesionDeEntrenamiento {
	private String titulo;
	private String deporte;
	private float distancia;
	private Date fechaInicio;
	private ZonedDateTime duracion;
	private Usuario usuario;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDeporte() {
		return deporte;
	}
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	public float getDistancia() {
		return distancia;
	}
	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public ZonedDateTime getDuracion() {
		return duracion;
	}
	public void setDuracion(ZonedDateTime duracion) {
		this.duracion = duracion;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		return "SesionDeEntrenamiento [titulo=" + titulo + ", deporte=" + deporte + ", distancia=" + distancia
				+ ", fechaInicio=" + fechaInicio + ", duracion=" + duracion + ", usuario=" + usuario + "]";
	}
	
	
	
	
}
