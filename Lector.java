package Biblioteca;

public class Lector {
	
	
	private String dni;
	private String direccion;
	private String telefono;
	private int prestamosVigentes = 0;
	private int fechaRetiro = 0;
	
	
	public Lector(String dni, String direccion, String telefono, int prestamosVigentes, int fechaRetiro) {

		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.prestamosVigentes = prestamosVigentes;
		this.fechaRetiro = fechaRetiro;
	}


	public String getTelefono() {
		return telefono;
	}


	public int getFechaRetiro() {
		return fechaRetiro;
	}


	public int getPrestamosVigentes() {
		return prestamosVigentes;
	}

	
	
	

}
