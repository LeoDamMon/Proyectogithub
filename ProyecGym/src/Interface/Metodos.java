package Interface;

import Modelo.Normal;
import Modelo.premium;

public interface Metodos {
	
	public void guardarn(Normal n, String nombreClase);
	public void listarn();
	public void eliminar(int indice);
	public double totaln();
	public Normal buscar(int indice);
	public void mostrarIndiceNombre();
	
	//----------------------------------------------------
	public void guardarp(premium p);
	public void listarp();
	public double totalnp();
	public void eliminarp(int indice);
	public premium buscarp(int indice);
	public void mostrarIndiceNombrep();

}
