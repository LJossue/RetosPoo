package figurasg;

import java.util.Scanner;

public class ejecucion {
  public static void main(String[] args) {
    int seleccion;
    rombo rom = new rombo();
    triangulo tri = new triangulo();
    hexagono hex = new hexagono();
    Scanner read = new Scanner(System.in);
    System.out.println("FIGURAS GEOMETRICAS\nSeleccione la figura\n1.- Triangulo\n2.- Rombo\n3.- Hexagono");
    seleccion = read.nextInt();
    switch (seleccion) {
      case 1:
        System.out.println("\n1.- Hallar perimetro\n2.- Hallar Area");
        seleccion = read.nextInt();
        if (seleccion == 1) {
          System.out.println("Ingrese el lado a");
          tri.setLadoA(read.nextDouble());
          System.out.println("Ingrese el lado b");
          tri.setLadoB(read.nextDouble());
          System.out.println("Ingrese el lado c");
          tri.setLadoC(read.nextDouble());
          tri.calcularPerimetro();
        } else if (seleccion == 2) {
          System.out.println("Ingrese la base.");
          tri.setBase(read.nextDouble());
          System.out.println("Ingrese la altura.");
          tri.setAltura(read.nextDouble());
          tri.calcularArea();
        }
        break;

      case 2:
        System.out.println("\n1.- Hallar perimetro\n2.- Hallar Area");
        seleccion = read.nextInt();
        if (seleccion == 1) {
          System.out.println("Ingrese un lado del rombo.");
          rom.setLadoA(read.nextDouble());
          rom.calcularPerimetro();
        } else if (seleccion == 2) {
          System.out.println("Ingrese la diagonal mayor.");
          rom.setdMayor(read.nextDouble());
          System.out.println("Ingrese la diagonal menor.");
          rom.setdMenor(read.nextDouble());
          rom.calcularArea();
        }
        break;

      case 3:
        System.out.println("\n1.- Hallar perimetro\n2.- Hallar Area");
        seleccion = read.nextInt();
        if (seleccion == 1) {
          System.out.println("Ingrese el lado a");
          hex.setLadoA(read.nextDouble());
          System.out.println("Ingrese el lado b");
          hex.setLadoB(read.nextDouble());
          System.out.println("Ingrese el lado c");
          hex.setLadoC(read.nextDouble());
          System.out.println("Ingrese el lado d");
          hex.setLadoD(read.nextDouble());
          System.out.println("Ingrese el lado e");
          hex.setLadoE(read.nextDouble());
          System.out.println("Ingrese el lado f");
          hex.setLadoF(read.nextDouble());
          hex.calcularPerimetro();
        } else if (seleccion == 2) {
          System.out.println("Ingrese el perimetro.");
          hex.setPerimetro(read.nextDouble());
          System.out.println("Ingrese la apotema.");
          hex.setApotema(read.nextDouble());
          hex.calcularArea();
        }
        break;

      default:
        System.out.println("Ingrese un dato valido");
        break;
    }

  }
}
