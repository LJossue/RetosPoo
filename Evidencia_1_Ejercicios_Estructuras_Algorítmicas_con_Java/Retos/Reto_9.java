package Retos;
import java.util.*;
public class Reto_9 {
  public static void main(String[] args) {
    String [] [] nombre;
    nombre = new String [4][4];
    Double[] [] precio;
    precio = new Double [4][4];
    Scanner read = new Scanner(System.in);
    for(int fila=0;fila<4;fila++)
{
for(int columna=0;columna<4;columna++)
{
System.out.println("Ingrese el producto de la Fila "+fila+" Columna "+columna);
nombre[fila][columna]=read.next();
System.out.println("Ingrese el precio:");
precio[fila][columna]=read.nextDouble();
}
}
System.out.println("\nLos productos en la maquina son: ");

for(int fila=0;fila<4;fila++)
{

for(int columna=0;columna<4;columna++)
{

System.out.print("En la posicion "+ fila+ "-" + columna + " hay: "+ nombre[fila][columna]+" - Precio: "+ precio[fila][columna] + "\n");

}
System.out.println("");

}
read.close();
}
  }

