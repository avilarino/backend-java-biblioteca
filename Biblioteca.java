package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
	ArrayList <Libro> libros = new ArrayList<>();
	ArrayList <Lector> lectores = new ArrayList<>();
	
	Biblioteca(){
		this.libros = libros;
		this.lectores = lectores;
	}
	
	public Libro buscarLibro(String identificador) {

		Libro libroBuscado = null;
		int i = 0;

		while (i < this.libros.size() && libroBuscado == null) {
			if (this.libros.get(i).getIdentificador().equalsIgnoreCase(identificador)) {
				libroBuscado = this.libros.get(i);
			}
			i++;
		}
		return libroBuscado;

	}

	public boolean agregarLibro(String titulo, String genero, Editorial editorial, String anio, Autor autor, String identificador,
			String fecha, EstadoLibro estado, int cantidad) {
		
		Libro libroAgregado = this.buscarLibro(identificador);
		boolean agregado = false;
		
		if(libroAgregado == null) {
			
			Libro libroNuevo = new Libro(titulo,genero,editorial,anio,autor,identificador,fecha,estado,cantidad);
			this.libros.add(libroNuevo);
			agregado = true;
		}
		
		return agregado;
		
	}

	
	public Lector buscarLector(String telefono) {

		Lector lectorBuscado = null;
		int i = 0;

		while (i < this.lectores.size() && lectorBuscado == null) {
			if (this.lectores.get(i).getTelefono().equalsIgnoreCase(telefono)) {
				lectorBuscado = this.lectores.get(i);
			}
			i++;
		}
		return lectorBuscado;

	}
	
	public boolean agregarLector(String dni, String direccion, String telefono, int prestamosVigentes, int fechaRetiro) {
		
		Lector lectorAgregado = this.buscarLector(telefono);
		boolean agregado = false;
		
		if(lectorAgregado == null) {
			
			Lector lectorNuevo = new Lector(dni,direccion,telefono,prestamosVigentes,fechaRetiro);
			this.lectores.add(lectorNuevo);
			agregado = true;
		}
		
		return agregado;
		
	}
	
	
	public Estado prestar(Libro libro, Lector lector) {
		
		Estado resultado = Estado.PRESTAMO_EXITOSO;
		EstadoLibro resultadoLibro = EstadoLibro.BIBLIOTECA;
		
		if(lector.getFechaRetiro() > 7) {
			resultado = Estado.MULTA_VIGENTE;
		} else if (lector.getPrestamosVigentes() > 3) {
			resultado = Estado.TOPE_PRESTAMOS_ALCANZADO;
		} else if (libro.getCantidad() == 0) {
			resultado = Estado.NO_HAY_EJEMPLARES;
		} else if (resultadoLibro == EstadoLibro.BIBLIOTECA) {
			resultado = Estado.PRESTAMO_EXITOSO;
			libro.setEstado(EstadoLibro.PRESTADO);
		}
		
		return resultado;
		
	}
	

	
	
	
}
