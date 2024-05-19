package Main;

import java.util.Scanner;

import Implementacion.ImpNormal;
import Implementacion.ImpPremium;
import Modelo.Normal;
import Modelo.premium;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectura=null;
		
		String numCuenta;
		String nombrenorm;
		int pagoins;
		Normal normales;
		
		String numCuentap;
		String nombrep;
		int pagoinsp;
		premium prem;
		
		ImpNormal impnorm= new ImpNormal();
		ImpPremium impprem= new ImpPremium();
		
		int menu,menuNormal,menuPremium,indice;
		
		
		
		do {
			
			System.out.println("Menu de gestion de miembros de gymnasio");
			System.out.println("1. Plan normal");
			System.out.println("2. Plan premium");
			System.out.println("3. Salir");
			lectura=new Scanner(System.in);
			menu=lectura.nextInt();
			
			
			switch(menu) {
//--------------------Menu normal----------------------------------------------------------------------------------------------			
			case 1:
				do {
				System.out.println("Menu de plan normal");
				System.out.println("1. Dar de alta");
				System.out.println("2. Lista de miembros de plan normal");
				System.out.println("3. Buscar miembro");
				System.out.println("4. Dar de baja de plan normal");
				System.out.println("5. Monto total de pagos de inscripcion");
				System.out.println("6. Salir");
				lectura=new Scanner(System.in);
				menuNormal=lectura.nextInt();
				
				switch(menuNormal) {
				
				case 1:
					System.out.println("Agregue el Curp");
					lectura=new Scanner(System.in);
					numCuenta=lectura.nextLine();
					
					System.out.println("Agregue el nombre");
					lectura=new Scanner(System.in);
					nombrenorm=lectura.nextLine();
					
					System.out.println("Agregue el deposito del pago de inscripcion al plan normal");
					lectura=new Scanner(System.in);
					pagoins=lectura.nextInt();
					
					normales= new Normal(numCuenta,nombrenorm,pagoins);
					impnorm.guardarn(normales,"normi");
					
					
					break;
					
				case 2:
					
					impnorm.listarn();
					break;
					
					
				case 3:
					impnorm.mostrarIndiceNombre();
					System.out.println("Ingrese el indice a buscar");
						lectura= new Scanner(System.in);
						indice=lectura.nextInt();
						
						normales=(Normal) impnorm.buscar(indice);
						System.out.println("Se encontro "+ normales);
					
					break;
					
					
					
				case 4:
					
					impnorm.mostrarIndiceNombre();
					System.out.println("Ingrese el indice a eliminar");
						lectura= new Scanner(System.in);
						indice=lectura.nextInt();
					impnorm.eliminar(indice);
					
					
					break;
					
					
					
				case 5:
					
					impnorm.totaln();
					
					break;
				
				case 6:
					System.out.println("Saliendo");
					break;
				
				
				  }
				
		}while(menuNormal<6);
				
				break;
				
//--------------------Menu premium--------------------------------------------------------------------------				
			case 2:
				do {
					
					System.out.println("Menu de plan premium");
					System.out.println("1. Dar de alta");
					System.out.println("2. Lista de miembros de plan premium");
					System.out.println("3. Buscar miembro");
					System.out.println("4. Dar de baja de plan premium");
					System.out.println("5. Monto total de pagos de inscripcion");
					System.out.println("6. Salir");
					lectura=new Scanner(System.in);
					menuPremium=lectura.nextInt();
					
					switch(menuPremium) {
					
					case 1:
						System.out.println("Agregue el Curp");
						lectura=new Scanner(System.in);
						numCuentap=lectura.nextLine();
						
						System.out.println("Agregue el nombre");
						lectura=new Scanner(System.in);
						nombrep=lectura.nextLine();
						
						System.out.println("Agregue el deposito del pago de inscripcion al plan premium");
						lectura=new Scanner(System.in);
						pagoinsp=lectura.nextInt();
						
						prem= new premium(numCuentap,nombrep,pagoinsp);
						impprem.guardarp(prem);
						
						
						break;
						
					case 2:
						
						impprem.listarp();
						break;
						
						
					case 3:
						
						impprem.mostrarIndiceNombrep();
						System.out.println("Ingrese el indice a buscar");
							lectura= new Scanner(System.in);
							indice=lectura.nextInt();
							
							prem=(premium)impprem.buscarp(indice);
						System.out.println("Se encontro "+ prem);
						
						break;
						
						
						
					case 4:
						impprem.mostrarIndiceNombrep();
						System.out.println("Ingrese el indice a eliminar");
							lectura= new Scanner(System.in);
							indice=lectura.nextInt();
						impprem.eliminarp(indice);
						
						break;
						
						
						
					case 5:
						
						impprem.totalnp();
						
						break;
					
					case 6:
						System.out.println("Saliendo");
						break;
					
					
					
					}
					
				}while(menuPremium<6);
				
				
				break;
				
//-----------------------------------------------------------------------------------------------------------------------------				
				
			case 3:
				System.out.println("Saliendo");
				break;
			
			
			}
			
			
			
			
			
		}while(menu<3);
		
		

	}

}
