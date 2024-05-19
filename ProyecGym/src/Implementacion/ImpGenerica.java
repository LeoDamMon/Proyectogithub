package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Interface.Metodos;

import Modelo.Normal;
import Modelo.premium;

public class ImpGenerica implements Metodos {
	List<Normal> listan = new ArrayList<Normal>();
	List<premium> listap = new ArrayList<premium>();

	
	@Override
	public void guardarn(Normal n,String nombreClase) {
		// TODO Auto-generated method stub
		
		listan.add(n);
	}

	
	
	@Override
	public void listarn() {
		// TODO Auto-generated method stub
		System.out.println(listan);
		
	}

	@Override
	public double totaln() {
		// TODO Auto-generated method stub
		double total=0;
		
		for( Normal e:listan) {
			
			total+=e.getPagoins();
			
		}
		System.out.println("El monto es "+total);
		
		return 0;
	}
	
	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		listan.remove(indice);
	}
	
	@Override
	public Normal buscar(int indice) {
		// TODO Auto-generated method stub
		return listan.get(indice);
	}
	
	@Override
	public void mostrarIndiceNombre() {
		// TODO Auto-generated method stub
		System.out.println("Registros en la lista");
		for(int i=0; i<listan.size();i++) {
			if(listan.get(i).getClass().equals(Normal.class)) {
				//Casteo
				Normal noor = (Normal) listan.get(i);
				System.out.println("["+i+"]"+noor.getNombrenorm());
			
			
			}
	}
	}

	//------------------------------------------------------Normal -> Premium------------------
	
	@Override
	public void guardarp(premium p) {
		// TODO Auto-generated method stub
		listap.add(p);
	}

	@Override
	public void listarp() {
		// TODO Auto-generated method stub
		System.out.println(listap);
	}

	@Override
	public double totalnp() {
		// TODO Auto-generated method stub
		double total=0;
		
		for(premium a:listap) {
			
			total+=a.getPagoinsp();
		}
		System.out.println("El monto es "+total);
		return 0;
	}



	@Override
	public void eliminarp(int indice) {
		// TODO Auto-generated method stub
		listap.remove(indice);
	}



	@Override
	public premium buscarp(int indice) {
		// TODO Auto-generated method stub
		return listap.get(indice);
	}



	@Override
	public void mostrarIndiceNombrep() {
		// TODO Auto-generated method stub
		System.out.println("Registros en la lista");
		for(int i=0; i<listap.size();i++) {
			if(listap.get(i).getClass().equals(premium.class)) {
				//Casteo
				premium pre = (premium) listap.get(i);
				System.out.println("["+i+"]"+pre.getNombrep());
			
			
			}
	}
		
	}



	



	

	

	

}
