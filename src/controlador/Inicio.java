package controlador;
import java.util.Scanner;

import objetos.Customers;
import objetos.Products;
public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean accion = true;
boolean check = true;
boolean check2 = true;
Double value1=0.0;
Double value2=0.0;
Control c = new Control();
Products p = new Products();
Scanner s = new Scanner(System.in);
Scanner d = new Scanner(System.in);


c.menu();

while(accion == true) {
	
	do {
		s = new Scanner(System.in);
		try {
			value1 = s.nextDouble();
			check = value1.isNaN();
			check2 = false;
		} catch (Exception e) {
			check = true;
		}
		
		if(value1 >= 1 && value1 <= 15 && check == false) {
			check = false;
		}else if(value1 < 1 || value1 > 15 || check == true) {
			check = true;
			System.out.println("Esa no es una opción disponible");
		}
		
	}while(check != false);
	
	
	System.out.println("Digite la cantidad que desea");	
	
	do {
		d = new Scanner(System.in);
		
		try {
			value2 = d.nextDouble();
			check = value2.isNaN();
		} catch (Exception e) {
			System.out.println("Esa no es una cantidad válida");
			check = true;
		}
		
	}while(check != false);
	
	
	c.selector(value1, value2);
	
	System.out.println(" ");	
	System.out.println("¿Desea añadir algo más?");	
}

	}

}
