package Retos;

import java.util.Scanner;
public class Reto_2 {
public static void main(String[] args) {
    
 
 Scanner reader = new Scanner(System.in);
    double pesobebe = 0;
    double mesesbebe = 0;
    double dosisvacuna = 0;

System.out.println("Calcular la dosis para la vacuna de un bebe:");    
System.out.println("Introduce el peso del bebe en kg:");      
pesobebe = reader.nextInt();
System.out.println("Introduce los meses del bebe:");      
mesesbebe = reader.nextInt();
dosisvacuna = ((pesobebe + 10)/(mesesbebe * 10))* 8 ;
System.out.println("La dosis de la vacuna para el bebe de " + mesesbebe + " meses y "
+pesobebe+ " kg, es: "+dosisvacuna);
  
reader.close();
 }
}