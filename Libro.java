package Biblioteca;

public class Libro {
	
	private String titulo;
	private String genero;
	private Editorial editorial;
	private String anio;
	private Autor autor;
	private String identificador;
	private String fecha;
	private EstadoLibro estado;
	private int cantidad;

	
	
	public Libro(String titulo, String genero, Editorial editorial, String anio, Autor autor, String identificador,
			String fecha, EstadoLibro estado, int cantidad) {
		this.titulo = titulo;
		this.genero = genero;
		this.editorial = editorial;
		this.anio = anio;
		this.autor = autor;
		this.identificador = identificador;
		this.fecha = fecha;
		this.estado = estado;
		this.cantidad = cantidad;
	}


	public String getIdentificador() {
		return identificador;
	}


	public int getCantidad() {
		return cantidad;
	}


	public String getTitulo() {
		return titulo;
	}


	public EstadoLibro getEstado() {
		return estado;
	}


	public void setEstado(EstadoLibro estado) {
		this.estado = estado;
	}
	
	

}
