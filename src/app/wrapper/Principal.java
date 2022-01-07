package app.wrapper;

public class Principal {

	public static void main(String[] args) {
		
		String [] actores = {"Leonardo Di Caprio", "Kate Winslet"};
		
		//GRABACION
		Grabacion grabacion = new Grabacion();
		grabacion.setActores(actores);
		grabacion.setDuracionHoras(60);
		grabacion.setLugar("New York");		
		System.out.println(grabacion);
		
		//PELICULA
		Pelicula pelicula = new Pelicula(grabacion);
		System.out.println("\nPELICULA [Duracion= "+pelicula.getDuracion()+
				", Lugar= "+pelicula.getLugar()+",Actores= "+pelicula.getActores()+"]");
	
		
	
		
		
	}
}
