package juego;

import java.util.*;

public class juego {

  public static void main(String[] args) {
    rondas rond = new rondas();
    Scanner read = new Scanner(System.in);
    int decision;
    try {
      System.out.println("ADIVINA LA PELICULA");
      System.out.println("¿Empezar a jugar?\n1.-Si\n2.-No");
      decision = read.nextInt();
      switch (decision) {
        case 1:
          do {
            rond.ronda1();
            rond.ronda2();
            rond.ronda3();
            rond.ronda4();
            rond.finaljuego();
            System.out.println("¿Desea volver a jugar?\n1.-Si\n2.-No");
            rond.correctas = 0;
            rond.incorrectas = 0;
            decision = read.nextInt();
          } while (decision == 1);
          System.out.println("Salió del juego.");
          break;
        case 2:
          System.out.println("Salió del juego.");
          System.exit(0);
          break;
        default:
          System.out.println("No seleccionó una opción valida.");
          break;
      }
    } catch (Exception e) {
      System.out.println("Error al digitar.");
    }
    read.close();
  }
}
