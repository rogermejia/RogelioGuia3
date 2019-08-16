package objetos;

import java.util.ArrayList;
import java.util.List;

import Entidades.Producto;

public class Products {
	private static Producto repollo = new Producto("Repollo    ", Categories.getVerduras(), 2.50);
	private static Producto zanahorias = new Producto("Zanahorias ", Categories.getVerduras(), 3.00);
	private static Producto tomates = new Producto("Tomates    ", Categories.getVerduras(), 2.00);
		
	private static Producto res = new Producto("Res        ", Categories.getCarnes(), 6.25);
	private static Producto pollo = new Producto("Pollo      ", Categories.getCarnes(), 3.50);
	private static Producto pescado = new Producto("Pescado    ", Categories.getCarnes(), 4.00);

	private static Producto manzana = new Producto("Manzana    ", Categories.getFrutas(), 2.00);
	private static Producto melocotones = new Producto("Melocotones", Categories.getFrutas(), 3.00);
	private static Producto sandia = new Producto("Sandia     ", Categories.getFrutas(), 5.00);

	private static Producto leche = new Producto("Leche      ", Categories.getLacteos(), 2.00);
	private static Producto queso = new Producto("Queso      ", Categories.getLacteos(), 1.00);
	private static Producto crema = new Producto("Crema      ", Categories.getLacteos(), 1.50);

	private static Producto arroz = new Producto("Arroz      ", Categories.getGranosBasicos(), 1.00);
	private static Producto frijoles = new Producto("Frijoles   ", Categories.getGranosBasicos(), 1.75);
	private static Producto maiz = new Producto("Maiz       ", Categories.getGranosBasicos(), 3.00);
	
	private List<Producto> list = new ArrayList<>();
	
	
	
	
	public void lista(Producto p) {
		 
		list.add(p);
		
	}
	
	public void print() {
		for(Producto p: list) {
			System.out.println(p.getNomProduct());
		}
	}
	
	public static Producto getRes() {
		return res;
	}

	public static Producto getRepollo() {
		return repollo;
	}

	public static Producto getZanahorias() {
		return zanahorias;
	}

	public static Producto getTomates() {
		return tomates;
	}

	public static Producto getPollo() {
		return pollo;
	}

	public static Producto getPescado() {
		return pescado;
	}

	public static Producto getManzana() {
		return manzana;
	}

	public static Producto getMelocotones() {
		return melocotones;
	}

	public static Producto getSandia() {
		return sandia;
	}

	public static Producto getLeche() {
		return leche;
	}

	public static Producto getQueso() {
		return queso;
	}

	public static Producto getCrema() {
		return crema;
	}

	public static Producto getArroz() {
		return arroz;
	}

	public static Producto getFrijoles() {
		return frijoles;
	}

	public static Producto getMaiz() {
		return maiz;
	}

}
