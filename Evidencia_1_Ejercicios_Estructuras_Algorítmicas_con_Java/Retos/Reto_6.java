package Retos;
import java.util.*;
public class Reto_6 {
  public static void main(String[] args) {
    double apuesta;
    double dinero = 0;
    int cs;
    int seleccion;
    int cantidad =0;
    Scanner read = new Scanner(System.in);
    do{
    System.out.println("Bienvenido al juego del carisellazo.\nIngrese la cantidad de dinero a apostar:");
    apuesta = read.nextDouble();
    System.out.println("Ingrese cara o sello \n 1.- Cara \n 2.- Sello");
    cs = read.nextInt();
   Random numAleatorio = new Random();
boolean moneda = numAleatorio.nextBoolean();
System.out.println("Se arroja la moneda al aire...\nHa salido:");
if (moneda) {
    System.out.println("Cara");
    if (cs == 1) {
      dinero = dinero + (apuesta*2);
      System.out.println("¡Haz ganado!\nTu dinero actual es: " + dinero);
    }
    else if (cs == 2) {
      dinero = dinero - apuesta;
      System.out.println("¡Haz perdido!\nTu dinero actual es: " + dinero);
    }
    else{
      System.out.println("No seleccionaste ninguna opción...");
    }
    
} else {
    System.out.println("Sello");
        if (cs == 2) {
      dinero = dinero + (apuesta*2);
      System.out.println("¡Haz ganado!\nTu dinero actual es: " + dinero);
    }
    else if (cs == 1) {
      dinero = dinero - apuesta;
      System.out.println("¡Haz perdido!\nTu dinero actual es: " + dinero);
    }
    else{
      System.out.println("No seleccionaste ninguna opción...");
    }
}
cantidad ++;
    System.out.println("\n¿Quieres volver a jugar?\n1.-Si.\n2.-No");
    seleccion = read.nextInt();
}while(seleccion == 1);
System.out.println("\nGracias por jugar.\nLa cantidad de veces jugadas fue: "+ cantidad + "\nEl balance final de dinero es: " + dinero);
read.close();
}
}


