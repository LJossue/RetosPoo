package Retos;
import java.util.*;
public class Reto_7 {
  public static void main(String[] args) {
    int cantidad;
    double suma = 0;
    double promedio;
    Scanner read = new Scanner(System.in);
    System.out.println("Promedio de notas. \nIngrese la cantidad de notas: ");
    cantidad = read.nextInt();
     double[] notas = new double[cantidad];
     for(int i = 0; i<cantidad; i++){
      System.out.println("\nIngrese la nota " + (i + 1));
      notas[i]=read.nextDouble();
     }
     System.out.println("\nLas notas son: ");
     for(int n = 0; n<cantidad; n++){
      System.out.println(notas[n]);
      suma = suma + notas[n];
     }
     promedio = suma / cantidad;
     
     System.out.println("\nLa nota final es: " + promedio);
     if (promedio<3) {
      System.out.println("Reprobaste.");
     }
     else if(promedio >=3 && promedio <=4)
     {
      System.out.println("Pasaste raspando.");
     }
     else if(promedio >4)
     {
      System.out.println("Pasaste con buenos resultados.");
     }
     read.close();
  }
}
