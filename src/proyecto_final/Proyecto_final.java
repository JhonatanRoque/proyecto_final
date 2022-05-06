package proyecto_final;

import java.util.*;

public class Proyecto_final {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un radio");
        sc.useLocale(Locale.US);
        double radio=sc.nextDouble();
        System.out.println("");
        //Formula area circulo, usamos algunos de los metodos de Math
        double area=Math.PI*Math.pow(radio, 2);
  
        System.out.println("El area del circulo es "+area);
    }
    
}
