package Retos;
import java.util.*;
public class Reto_3 {
  public static void main(String[] args) {
    int cs;
    Scanner read = new Scanner(System.in);
    System.out.println("Ingrese cara o sello \n 1.- Cara \n 2.- Sello");
    cs = read.nextInt();
  Random numAleatorio = new Random();
boolean moneda = numAleatorio.nextBoolean();
System.out.println("Se arroja la moneda al aire...\nHa salido:");
if (moneda) {
    System.out.println("Cara");
    if (cs == 1) {
      System.out.println("¡Haz ganado!");
    }
    else if (cs == 2) {
      System.out.println("¡Haz perdido!");
    }
    else{
      System.out.println("No seleccionaste ninguna opción...");
    }
    
} else {
    System.out.println("Sello");
        if (cs == 2) {
      System.out.println("¡Haz ganado!");
    }
    else if (cs == 1) {
      System.out.println("¡Haz perdido!");
    }
    else{
      System.out.println("No seleccionaste ninguna opción...");
    }
    read.close();
}

}
}


