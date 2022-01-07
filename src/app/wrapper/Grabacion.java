package app.wrapper;

import java.util.Arrays;

public class Grabacion {

	private int duracionHoras;
	private String lugar;
	private String [] actores;
	
	
	public int getDuracionHoras() {
		return duracionHoras;
	}

	public String getLugar() {
		return lugar;
	}
	public void setDuracionHoras(int duracionHoras) {
		this.duracionHoras = duracionHoras;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String [] getActores() {
		return actores;
	}

	public void setActores(String [] actores) {
		this.actores = actores;
	}

	@Override
	public String toString() {
		return "GRABACION [Duracion = " + duracionHoras + "hs , Lugar=" + lugar + ", Actores="
				+ Arrays.toString(actores) + "]";
	}
	
	
	
	
}
