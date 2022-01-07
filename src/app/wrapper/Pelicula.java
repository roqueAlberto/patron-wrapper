package app.wrapper;

import java.util.Arrays;

public class Pelicula {

	private Grabacion grabacionTitanic;

	public Pelicula(Grabacion grabacionTitanic) {
		this.grabacionTitanic = grabacionTitanic;
	}
	
	public String getDuracion() {
		return "3hs 14 minutos";
	}
	
	public String getLugar() {
		return "Oceano atlantico";
	}
	
	public String getActores() {
		return Arrays.toString(grabacionTitanic.getActores());
	}
}
