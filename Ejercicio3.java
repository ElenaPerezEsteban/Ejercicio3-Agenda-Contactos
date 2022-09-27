package dam2.inicial.ejercicio3;

import java.util.ArrayList;

import java.util.Scanner;





public class Ejercicio3 {

	public static void main(String[] args) {
		/**
		 * Ejercicio 3. Crea una agenda de contactos con las funcionalidades de leer,
		 * añadir y borrar contactos haciendo uso de un ArrayList de tipo Contacto (se
		 * debe crear dicha clase con los atributos necesarios) para almacenar los
		 * contactos de dicha agenda. Constará de un menú en la función main que llamará
		 * a las funciones correspondientes para cada acción. Dicho menú deberá
		 * mostrarse indefinidamente una vez realizada cada acción, pudiendo salir del
		 * programa cuando se introduzca el valor ‘s’ (el programa únicamente lo tendrá
		 * en cuenta si el carácter se ha introducido en minúsculas, en caso contrario o
		 * si la opción del menú introducida no existe, deberá indicar que la opción no
		 * es válida, informando de ello al usuario, volviendo a solicitar la
		 * introducción de una opción válida de manera indefinida).
		 */
		Scanner sc = new Scanner(System.in);
		
		Contacto contacto1 = new Contacto("contacto1", "644023938", "contacto1@gmail.com");
		Contacto contacto2 = new Contacto("contacto2", "620554935", "contacto2@gmail.com");
		Contacto contacto3 = new Contacto("contacto3", "642059589", "contacto3@gmail.com");
		
		ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
		
		listaContactos.add(contacto1);
		listaContactos.add(contacto2);
		listaContactos.add(contacto3);

		String opcion;

		do {
			
			Contacto contacto = new Contacto();
			
			System.out.println("Elija una de estas opciones:\n1. Leer, 2. Añadir, 3. Borrar, s. Salir");
			opcion = sc.next();
			
			switch (opcion) {
			
			case "1":// LEER LISTA DE CONTACTOS
				
				String agenda = listarAgenda(listaContactos);
				System.out.println(agenda);

				break;

			case "2":// AÑADIR CONTACTO
				System.out.println("Introduzca nombre del contacto");
				String nombre = sc.next();
				contacto.setNombre(nombre);
				if (Contacto.existeContacto(listaContactos, nombre)) {
					System.out.println("el contacto ya existe");
				} else {
					System.out.println("Introduzca teléfono del contacto");
					String telefono = sc.next();
					contacto.setTelefono(telefono);

					System.out.println("Introduzca email del contacto");
					String email = sc.next();
					contacto.setEmail(email);

					listaContactos.add(contacto);

				}

				break;

			case "3":// BORRAR CONTACTO
				// TO DO
				System.out.println("Introduzca contacto que desea eliminar");
				nombre = sc.next();

				int pos = contacto.borrarContacto(listaContactos, nombre);
				if (pos >= 0) {
					listaContactos.remove(pos);
					System.out.println("Contacto eliminado");
				} else {
					System.out.println("El contacto no existe");

				}
				
				break;
			case "s":// SALIR
				// TO DO
				System.out.println("hasta pronto");

				break;

			default:
				System.out.println("introduce solo opciones disponibles en el menú");
			}
			
		} while (!opcion.equals("s"));
		
	}
	
	public static String listarAgenda(ArrayList<Contacto> listaContactos) {
		
		String agenda = "";
		for (int i = 0; i < listaContactos.size(); i++) {
			
			Contacto listado = listaContactos.get(i);
			
			agenda = agenda + "\nNombre: " + listado.getNombre() + "\nTeléfono: " + listado.getTelefono()+ "\nEmail: " + listado.getEmail();
		}
		return agenda;
	}

}
