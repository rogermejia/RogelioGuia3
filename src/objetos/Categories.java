package objetos;

import Entidades.Areas;

public class Categories {
	private static Areas verduras = new Areas("verduras");
	private static Areas frutas = new Areas("frutas");
	private static Areas carnes = new Areas("carnes");
	private static Areas lacteos = new Areas("lacteos");
	private static Areas granosBasicos = new Areas("granosBasicos");

	public static Areas getFrutas() {
		return frutas;
	}



	public static Areas getVerduras() {
		return verduras;
	}



	public static Areas getCarnes() {
		return carnes;
	}



	public static Areas getLacteos() {
		return lacteos;
	}



	public static Areas getGranosBasicos() {
		return granosBasicos;
	}



}
