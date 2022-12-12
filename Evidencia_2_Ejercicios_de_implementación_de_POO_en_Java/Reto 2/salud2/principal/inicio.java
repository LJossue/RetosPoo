package principal;

import salud.persona;

public class inicio {
  public static void main(String[] args) {
    persona per = new persona();
    System.out.println("Calcular si su peso es el ideal.");
    per.pedirDatos();
    per.mostarPersona();
    per.mayorEdad();
    per.calcularImc(per.getPeso(), per.getEstatura());
    if (per.getcPeso() == "PESOBAJO") {
      System.out.println("Esta por debajo de lo ideal");
    } else if (per.getcPeso() == "PESOIDEAL") {
      System.out.println("El peso es el ideal");
    } else if (per.getcPeso() == "SOBREPESO") {
      System.out.println("Tiene sobrepeso");
    }
  }
}
