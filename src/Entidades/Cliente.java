package Entidades;

public class Cliente {
private String nombre;
private String pNombre;
private String pApellido;
private Integer edad;

public Cliente() {
	
}

public Cliente(String pNombre, String pApellido) {
	super();
	this.pNombre = pNombre;
	this.pApellido = pApellido;
}

public String getNombreCompleto() {
	setNombre();
	return nombre;
}

public void setNombre() {
	this.nombre = pNombre +" "+ pApellido;
}

public String getpNombre() {
	return pNombre;
}

public void setpNombre(String pNombre) {
	this.pNombre = pNombre;
}

public String getpApellido() {
	return pApellido;
}

public void setpApellido(String pApellido) {
	this.pApellido = pApellido;
}

public Integer getEdad() {
	return edad;
}

public void setEdad(Integer edad) {
	this.edad = edad;
}



}
