package Biblioteca;

public class Test {

	public static void main(String[] args) {
		
		
		Biblioteca biblioteca = new Biblioteca();
        
 
        biblioteca.agregarLibro("Harry Potter", "Fantasía", new Editorial("Editorial A", "País A"), "2001",
                new Autor("J.K. Rowling", "Inglesa", "31 de julio de 1965"), "ISBN001", "01/07/2023",
                EstadoLibro.BIBLIOTECA, 5);
        biblioteca.agregarLibro("El código Da Vinci", "Misterio", new Editorial("Editorial B", "País B"), "2003",
                new Autor("Dan Brown", "Estadounidense", "22 de junio de 1964"), "ISBN002", "01/07/2023",
                EstadoLibro.BIBLIOTECA, 3);

       
        biblioteca.agregarLector("12345678", "Calle 123", "1111111111", 0, 0);
        biblioteca.agregarLector("87654321", "Calle 456", "2222222222", 1, 5);
        

        Libro libroBuscado = biblioteca.buscarLibro("ISBN001");
        if (libroBuscado != null) {
            System.out.println("Libro encontrado: " + libroBuscado.getTitulo());
        } else {
            System.out.println("Libro no encontrado.");
        }
        

        Lector lectorBuscado = biblioteca.buscarLector("1111111111");
        if (lectorBuscado != null) {
            System.out.println("Lector encontrado: " + lectorBuscado.getTelefono());
        } else {
            System.out.println("Lector no encontrado.");
        }
        
        // Realizar un préstamo
        Estado estadoPrestamo = biblioteca.prestar(libroBuscado, lectorBuscado);
        System.out.println("Estado del préstamo: " + estadoPrestamo);
    }

	

}
