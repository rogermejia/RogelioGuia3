package Entidades;

public class Producto {
	
private String nomProduct;
private Areas area;
private Double price;


public Producto() {
	
}



public Producto(String nomProduct, Areas area, Double price) {
	super();
	this.nomProduct = nomProduct;
	this.area = area;
	this.price = price;
}



public String getNomProduct() {
	return nomProduct;
}
public void setNomProduct(String nomProduct) {
	this.nomProduct = nomProduct;
}
public Areas getArea() {
	return area;
}
public void setArea(Areas area) {
	this.area = area;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}


//GETTERS Y SETTERS STATIC PARA EXPORTAR A OTROS PAQUETES
public static Areas getVerduras() {
	// TODO Auto-generated method stub
	return null;
}



public static Areas getCarnes() {
	// TODO Auto-generated method stub
	return null;
}



public static Areas getFrutas() {
	// TODO Auto-generated method stub
	return null;
}



public static Areas getLacteos() {
	// TODO Auto-generated method stub
	return null;
}



public static Areas getGranosBasicos() {
	// TODO Auto-generated method stub
	return null;
}





}
