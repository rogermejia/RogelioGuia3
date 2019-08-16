package controlador;

import java.util.List;

import javax.sound.midi.Soundbank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import Entidades.Details;
import Entidades.Producto;
import objetos.Descuento;
import objetos.Products;

public class Control {
	List<Producto> listaProd = new ArrayList<Producto>();
	List<Details> listaDet = new ArrayList<>();
	Products prod = new Products();
	Details detalle;
	int size = 0;
	Producto listProd[] = new Producto[size];
	
	public void menu() {
		System.out.println("Elija el número de la opción ");
		System.out.println("y luego la cantidad de productos que desee; ");
		System.out.println("");
		System.out.println("1.Repollo     2.Zanahorias  3.Tomates     4.Res         5.Pollo");
		System.out.println("6.Pescado     7.Manzana     8.Melocotones 9.Sandia      10.Leche");
		System.out.println("11.Queso      12.Crema      13.Arroz      14.Frijoles   15.Maiz");
	}

	public void selector(Double s, Double n) {
		Integer j = (int) Math.round(n);
		detalle = new Details();
		if (s == 1) {
			detalle.setProducto(Products.getRepollo().getNomProduct());
			detalle.setPrecio(Products.getRepollo().getPrice());
			detalle.setCategoria(Products.getRepollo().getArea().getArea());
			detalle.setCantidad(j);
			Double precio = Products.getRepollo().getPrice() * j;
			detalle.setSubTotal(precio);
		} else if (s == 2) {
			detalle.setProducto(Products.getZanahorias().getNomProduct());
			detalle.setPrecio(Products.getZanahorias().getPrice());
			detalle.setCategoria(Products.getZanahorias().getArea().getArea());
			detalle.setCantidad(j);
			Double precio = Products.getZanahorias().getPrice() * j;
			detalle.setSubTotal(precio);
		} else if (s == 3) {
			detalle.setProducto(Products.getTomates().getNomProduct());
			detalle.setPrecio(Products.getTomates().getPrice());
			detalle.setCategoria(Products.getTomates().getArea().getArea());
			detalle.setCantidad(j);
			Double precio = Products.getTomates().getPrice() * j;
			detalle.setSubTotal(precio);
		} else if (s == 4) {
			detalle.setProducto(Products.getRes().getNomProduct());
			detalle.setPrecio(Products.getRes().getPrice());
			detalle.setCategoria(Products.getRes().getArea().getArea());
			detalle.setCantidad(j);
			Double precio = Products.getRes().getPrice() * j;
			detalle.setSubTotal(precio);
		} else if (s == 5) {
			detalle.setProducto(Products.getPollo().getNomProduct());
			detalle.setPrecio(Products.getPollo().getPrice());
			detalle.setCategoria(Products.getPollo().getArea().getArea());
			detalle.setCantidad(j);
			Double precio = Products.getPollo().getPrice() * j;
			detalle.setSubTotal(precio);
		} else if (s == 6) {
			detalle.setProducto(Products.getPescado().getNomProduct());
			detalle.setPrecio(Products.getPescado().getPrice());
			detalle.setCategoria(Products.getPescado().getArea().getArea());
			detalle.setCantidad(j);
			Double precio = Products.getPescado().getPrice() * j;
			detalle.setSubTotal(precio);
		} else if (s == 7) {
			detalle.setProducto(Products.getManzana().getNomProduct());
			detalle.setPrecio(Products.getManzana().getPrice());
			detalle.setCategoria(Products.getManzana().getArea().getArea());
			detalle.setCantidad(j);
			Double precio = Products.getManzana().getPrice() * j;
			detalle.setSubTotal(precio);
		} else if (s == 8) {
			detalle.setProducto(Products.getMelocotones().getNomProduct());
			detalle.setPrecio(Products.getMelocotones().getPrice());
			detalle.setCategoria(Products.getMelocotones().getArea().getArea());
			detalle.setCantidad(j);
			Double precio = Products.getMelocotones().getPrice() * j;
			detalle.setSubTotal(precio);
		} else if (s == 9) {
			detalle.setProducto(Products.getSandia().getNomProduct());
			detalle.setPrecio(Products.getSandia().getPrice());
			detalle.setCategoria(Products.getSandia().getArea().getArea());
			detalle.setCantidad(j);
			Double precio = Products.getSandia().getPrice() * j;
			detalle.setSubTotal(precio);
		} else if (s == 10) {
			detalle.setProducto(Products.getLeche().getNomProduct());
			detalle.setPrecio(Products.getLeche().getPrice());
			detalle.setCategoria(Products.getLeche().getArea().getArea());
			detalle.setCantidad(j);
			Double precio = Products.getLeche().getPrice() * j;
			detalle.setSubTotal(precio);
		} else if (s == 11) {
			detalle.setProducto(Products.getQueso().getNomProduct());
			detalle.setPrecio(Products.getQueso().getPrice());
			detalle.setCategoria(Products.getQueso().getArea().getArea());
			detalle.setCantidad(j);
			Double precio = Products.getQueso().getPrice() * j;
			detalle.setSubTotal(precio);
		} else if (s == 12) {
			detalle.setProducto(Products.getCrema().getNomProduct());
			detalle.setPrecio(Products.getCrema().getPrice());
			detalle.setCategoria(Products.getCrema().getArea().getArea());
			detalle.setCantidad(j);
			Double precio = Products.getCrema().getPrice() * j;
			detalle.setSubTotal(precio);
		} else if (s == 13) {
			detalle.setProducto(Products.getArroz().getNomProduct());
			detalle.setPrecio(Products.getArroz().getPrice());
			detalle.setCategoria(Products.getArroz().getArea().getArea());
			detalle.setCantidad(j);
			Double precio = Products.getArroz().getPrice() * j;
			detalle.setSubTotal(precio);
		} else if (s == 14) {
			detalle.setProducto(Products.getFrijoles().getNomProduct());
			detalle.setPrecio(Products.getFrijoles().getPrice());
			detalle.setCategoria(Products.getFrijoles().getArea().getArea());
			detalle.setCantidad(j);
			Double precio = Products.getFrijoles().getPrice() * j;
			detalle.setSubTotal(precio);
		} else if (s == 15) {
			detalle.setProducto(Products.getMaiz().getNomProduct());
			detalle.setPrecio(Products.getMaiz().getPrice());
			detalle.setCategoria(Products.getMaiz().getArea().getArea());
			detalle.setCantidad(j);
			Double precio = Products.getMaiz().getPrice() * j;
			detalle.setSubTotal(precio);
		}
		agregar();
	}
	

	public void agregar() {
		listaDet.add(detalle);
		imprimir();
	}

	Double total = 0.0;
	Double result = 0.0;
	Double desc = 0.00;
	DecimalFormat f = new DecimalFormat("##.00");
	public void imprimir() {
		System.out.println("Producto   Precio  Cantidad  Subtotal    Descuento");
		for (Details d : listaDet) {
			System.out.print(d.getProducto() + " ");
			System.out.print(d.getPrecio() + "       ");
			System.out.print(d.getCantidad() + "        ");
			String categ = d.getCategoria();
			
			Double sub = d.getSubTotal();
			if (categ.equalsIgnoreCase("verduras") || categ.equalsIgnoreCase("frutas")
					|| categ.equalsIgnoreCase("carnes")) {
				if (sub <= 19.99) {
					desc = 0.0;
					sub = d.getSubTotal();
				}else if (sub >= 20 && sub <= 49.99) {
					desc =  sub * Descuento.getDes5();
					sub = sub - (desc);
										
				}else if ( sub >= 50) {
					desc =  sub * Descuento.getDes7();
					sub = sub - (desc);
				}
				
			}else {
				desc = 0.0;
				sub = d.getSubTotal();
			}
			total = sub;
			
			
			System.out.print(f.format(sub) + "           ");
			System.out.println(f.format(desc) + "   ");

		}
		result = result + total;
		
		System.out.println("Total                          " + f.format(result));
	}

	public void printer() {
		for (int i = size; i >= size; i++) {
			System.out.println(listProd[size]);
		}
	}

	public List<Producto> getListaProd() {
		return listaProd;
	}

	public void setListaProd(List<Producto> listaProd) {
		this.listaProd = listaProd;
	}

}
