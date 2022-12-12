package Retos;
import java.util.*;
public class Reto_8 {
  public static void main(String[] args) {
    int cantidad;
  
    double ganador;
    
     Scanner read = new Scanner(System.in);
    System.out.println("Competicion de natacion \nIngrese la cantidad de nadadores: ");
    cantidad = read.nextInt();
        String[] nombres = new String[cantidad];
    Double[] tiempos = new Double[cantidad];
    for(int i=0; i<cantidad; i++)
    {
      System.out.println("Ingrese los datos del nadador " + (i+1));
      System.out.println("Nombre: ");
      nombres[i]= read.next();
      System.out.println("Tiempo (Segundos): ");
      tiempos[i]= read.nextDouble();
    }
    System.out.println("\nLos nadadores y sus tiempos son: ");
    for(int n=0;n<cantidad;n++){
      System.out.println(nombres[n] + " - con un tiempo de: " + tiempos[n] + " s");

    }
    ganador= tiempos[0];
     for(int g=0;g<cantidad;g++){
        
        if(tiempos[g]<ganador){
            ganador= tiempos[g];
        }
        
  }
  for(int t=0;t<cantidad;t++){
        
        if(tiempos[t] .equals(ganador)){
            System.out.println("\nEl ganador es: \n" + nombres[t] + " con un tiempo de: " + tiempos[t]);
        }
}
read.close();
  }
}
