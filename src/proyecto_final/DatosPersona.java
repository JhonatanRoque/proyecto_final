
package proyecto_final;

import java.util.Scanner;

public class DatosPersona {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese su apellido: ");
        String apellido = leer.nextLine();
        
        System.out.println("\n--------------------------------------------------");
        System.out.println("Los datos que usted ingreso son los siguientes...\n");
        System.out.print("Nombre: " + nombre);
        System.out.print("Apellido: " + apellido);
    }
}
