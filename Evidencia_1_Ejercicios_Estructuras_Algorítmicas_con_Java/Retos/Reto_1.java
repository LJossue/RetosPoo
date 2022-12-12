package Retos;

import java.util.Scanner;
public class Reto_1 {
public static void main(String[] args) {
    
 
  Scanner reader = new Scanner(System.in);
    double gradosF = 0;

    
System.out.println("Introduce los grados Fahrenheit:");      
gradosF = reader.nextInt();
double gradosC = (gradosF - 32) / 1.8;
System.out.println("El resultado en grados Centigrados es: "+ gradosC);
  reader.close();
 }
}