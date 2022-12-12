package juego;

import java.util.*;

public class rondas {
  Scanner read = new Scanner(System.in);
  int decision;
  int correctas = 0;
  int incorrectas = 0;
  String[] ronda1 = { "1.-Shrek", "2.-El gato con botas", "3.-Bolt" };
  String[] ronda2 = { "1.-Alicia en el pais de las maravillas", "2.-Frozen", "3.-Valiente" };
  String[] ronda3 = { "1.-El Rey Leon", "2.-Pinocho", "3.-Zootopia" };
  String[] ronda4 = { "1.-Scary Movie", "2.-Saw", "3.-It (Eso)" };

  public void ronda1() {
    System.out.println("RONDA 1");
    System.out.println("El personaje principal es un gato tierno pero con estilo...");
    for (int i = 0; i < ronda1.length; i++) {
      System.out.println(ronda1[i]);
    }
    decision = read.nextInt();
    if (decision == 2) {
      System.out.println("Correcto!");
      correctas++;
    } else {
      System.out.println("Incorrecto la respuesta es: El gato con botas");
      incorrectas++;
    }
  }

  public void ronda2() {
    System.out.println("RONDA 2");
    System.out.println("Entre sus personajes principales hay un muñeco de nieve muy peculiar...");
    for (int i = 0; i < ronda2.length; i++) {
      System.out.println(ronda2[i]);
    }
    decision = read.nextInt();
    if (decision == 2) {
      System.out.println("Correcto!");
      correctas++;
    } else {
      System.out.println("Incorrecto la respuesta es: Frozen");
      incorrectas++;
    }
  }

  public void ronda3() {
    System.out.println("RONDA 3");
    System.out.println("¡Hakuna Matata!");
    for (int i = 0; i < ronda3.length; i++) {
      System.out.println(ronda3[i]);
    }
    decision = read.nextInt();
    if (decision == 1) {
      System.out.println("Correcto!");
      correctas++;
    } else {
      System.out.println("Incorrecto la respuesta es: El Rey Leon");
      incorrectas++;
    }
  }

  public void ronda4() {
    System.out.println("RONDA 4");
    System.out.println("Flotan, Georgie. Y cuando estés aquí abajo, conmigo, tú también flotarás...");
    for (int i = 0; i < ronda4.length; i++) {
      System.out.println(ronda4[i]);
    }
    decision = read.nextInt();
    if (decision == 3) {
      System.out.println("Correcto!");
      correctas++;
    } else {
      System.out.println("Incorrecto la respuesta es: It (Eso)");
      incorrectas++;
    }
  }

  public void finaljuego() {
    System.out.println(
        "El juego ha finalizado.\nSu puntuación fue:\nCorrectas: " + correctas + "\nIncorrectas: " + incorrectas);
  }
}
