package Retos;
public class Reto_10 {
  public static void main(String[] args) {
    String[][] nombres = {
      {"Papas Margarita", "Galletas waffer","Chocolatina Jet"},
      {"Chiclets Adams", "Manimoto","Chocorramo"},
      {"Agua Cristal","CocaCola","Jugo HIT"}
};
int[][] precios = {
  {1500,800,1000},
  {600,800,1300},
  {1500,1700,1200}
};

for(int fila=0;fila<3;fila++)
{

for(int columna=0;columna<3;columna++)
{

System.out.print("En la posicion "+ fila+ "-" + columna + " hay: "+ nombres[fila][columna]+" - Precio: "+ precios[fila][columna] + "\n");

}
System.out.println("");

}
  }
}
