package Retos;
import java.util.*;
public class Reto_4 {
  public static void main(String[] args) {
     Random numAleatorio = new Random();
    int seleccion;
    int pc = numAleatorio.nextInt(3-1)+1;
    Scanner read = new Scanner(System.in);
    System.out.println("Piedra papel o tijera.");
    System.out.println("Seleccione una opción:\n1.-Piedra\n2.-Papel\n3.-Tijera");
    seleccion = read.nextInt();

    if (pc == 1) {
      System.out.println("La computadora selecciono Piedra.");
      if (seleccion == 1) {
        System.out.println("Empate.");
      }
      else if (seleccion == 2) {
        System.out.println("Ganaste.");
      }
      else if (seleccion == 3) {
        System.out.println("Perdiste.");
      }
      else{
System.out.println("No seleccionaste nada...");
      }
    }
     else if (pc == 2) {
      System.out.println("La computadora selecciono Papel.");
      if (seleccion == 1) {
        System.out.println("Perdiste.");
      }
      else if (seleccion == 2) {
        System.out.println("Empate.");
      }
      else if (seleccion == 3) {
        System.out.println("Ganaste.");
      }
      else{
System.out.println("No seleccionaste nada...");
      }
    }
     else if (pc == 3) {
      System.out.println("La computadora selecciono Piedra.");
      if (seleccion == 1) {
        System.out.println("Ganaste.");
      }
      else if (seleccion == 2) {
        System.out.println("Perdiste.");
      }
      else if (seleccion == 3) {
        System.out.println("Empate");
      }
      else{
System.out.println("No seleccionaste nada...");
      }
    }
    read.close();
  }
}
