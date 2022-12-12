package Retos;
import java.util.*;
public class Reto_5 {
  public static void main(String[] args) {
   int cantidad;
  double precio;
  double suma = 0;
  Scanner read = new Scanner(System.in);
    System.out.println("Bienvenido a la tienda.\n Ingrese la cantidad de productos a facturar:");
    cantidad = read.nextInt();
    for(int a = 1;  a <= cantidad; a++){
System.out.println("Ingrese el precio del producto " + a + ":");
precio = read.nextDouble();
suma = suma+ precio;
    }
System.out.println("El total de la compra es: " + suma);
read.close();
  }
}
