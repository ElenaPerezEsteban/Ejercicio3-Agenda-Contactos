package dam2.inicial.ejercicio3;

import java.util.ArrayList;



public class Contacto {
	
	String nombre;
	String telefono;
	String email;
	/**
	 * @param nombre
	 * @param telefono
	 * @param email
	 */
	public Contacto() {
		super();
	}
	
	public Contacto(String nombre, String telefono, String email) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static boolean existeContacto (ArrayList <Contacto>listaContactos, String nombre ){
		
		for (int i = 0; i<listaContactos.size(); i ++) {
			Contacto contacto= listaContactos.get(i);
			if (contacto.getNombre().equals(nombre)) {
				return true;
			}
			
		}
		return false;
		
	}
	public  int borrarContacto(ArrayList<Contacto> listaContactos, String nombre) {

		for (int i = 0; i < listaContactos.size(); i++) {
			Contacto contacto = listaContactos.get(i);
			if (contacto.getNombre().equals(nombre)) {
				return i;
			}
		}
		return -1;

	}

}
